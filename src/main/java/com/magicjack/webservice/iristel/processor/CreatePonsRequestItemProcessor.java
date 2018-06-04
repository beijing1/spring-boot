package com.magicjack.webservice.iristel.processor;

import java.lang.reflect.InvocationTargetException;
import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.magicjack.webservice.iristel.config.CreatePonsRequestHelper;
import com.magicjack.webservice.iristel.dao.mapper.*;
import com.magicjack.webservice.iristel.domain.vo.*;
import com.magicjack.webservice.iristel.service.IristeService;

import https.LnpCreatePonRequest;

@Component
public class CreatePonsRequestItemProcessor implements ItemProcessor<CreatePonsRequest, LnpCreatePonRequest> {

    @Autowired
    private SqlSessionFactory sessionFactory;
    
    @Autowired
    private IristeService webService;
    
    private static final Logger logger = LoggerFactory.getLogger(CreatePonsRequestItemProcessor.class);

    @Override
    public LnpCreatePonRequest process(final CreatePonsRequest pon) throws Exception {
        try(SqlSession session = sessionFactory.openSession()){
            List<CPReqServiceDetail> sdList = getSDDetailsByPonId(session, pon.getId());
            List<CPReqRoutingDetail> rdList = getRDDetailsByPonId(session, pon.getId());
            
            try {
                LnpCreatePonRequest lnpPon = CreatePonsRequestHelper.mapCreatePonRequest(pon, sdList, rdList);
                String ponNumber = webService.createPons(pon.getId(), lnpPon, session);
                
                deletePonRecord(pon, session);
                moveCPRHistory(pon, ponNumber, session);
                moveSDHistory(sdList, session);
                moveRDHistory(rdList, session);
                session.commit();
            } catch (RemoteException e) {
                logger.error("{}", e);
            }
        }
        
        return null;
    }

    private List<CPReqServiceDetail> getSDDetailsByPonId(SqlSession session, Long id){
        CPReqServiceDetailMapper mapper = session.getMapper(CPReqServiceDetailMapper.class);
        CPReqServiceDetailExample example = new CPReqServiceDetailExample();
        example.createCriteria().andIdEqualTo(id);
        return mapper.selectByExample(example);
    }
    
    private List<CPReqRoutingDetail> getRDDetailsByPonId(SqlSession session, Long id){
        CPReqRoutingDetailMapper mapper = session.getMapper(CPReqRoutingDetailMapper.class);
        CPReqRoutingDetailExample example = new CPReqRoutingDetailExample();
        example.createCriteria().andIdEqualTo(id);
        return mapper.selectByExample(example);
    }
    
    private void moveCPRHistory(CreatePonsRequest pon, String ponNumber, SqlSession session) {
        CreatePonsRequestHistMapper histMapper = session.getMapper(CreatePonsRequestHistMapper.class);
        CreatePonsRequestHist history = new CreatePonsRequestHist();
        
        history.setId(pon.getId());
        
        try {
            BeanUtils.copyProperties(history, pon);
        } catch (IllegalAccessException | InvocationTargetException e) {
            logger.error("{}", e);
        }
        
        if(StringUtils.isBlank(ponNumber)) {
            history.setStatus("F");
        }else {
            history.setStatus("S");
            history.setPon(ponNumber);
        }
        
        history.setMdyBy(history.getCreatedBy());
        history.setMdyTs(new Timestamp(System.currentTimeMillis()));
        histMapper.insert(history);
    }
    
    private void moveSDHistory(List<CPReqServiceDetail> sdList, SqlSession session) {
        CPReqSDHistMapper histMapper = session.getMapper(CPReqSDHistMapper.class);
        
        for(CPReqServiceDetail sd : sdList) {
            CPReqSDHist history = new CPReqSDHist();
            try {
                BeanUtils.copyProperties(history, sd);
            } catch (IllegalAccessException | InvocationTargetException e) {
                logger.error("{}", e);
            }
            
            histMapper.insert(history);
        }
    }
    
    private void moveRDHistory(List<CPReqRoutingDetail> rdList, SqlSession session) {
        CPReqRDHistMapper histMapper = session.getMapper(CPReqRDHistMapper.class);
        
        for(CPReqRoutingDetail rd : rdList) {
            CPReqRDHist history = new CPReqRDHist();
            try {
                BeanUtils.copyProperties(history, rd);
            } catch (IllegalAccessException | InvocationTargetException e) {
                logger.error("{}", e);
            }
            
            histMapper.insert(history);
        }
    }
    
    private void deletePonRecord(CreatePonsRequest pon, SqlSession session) {
        CreatePonsRequestMapper mapper = session.getMapper(CreatePonsRequestMapper.class);
        mapper.deleteByPrimaryKey(pon.getId());
    }
}
