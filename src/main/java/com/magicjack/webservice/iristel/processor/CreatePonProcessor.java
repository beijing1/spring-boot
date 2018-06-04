package com.magicjack.webservice.iristel.processor;

import java.lang.reflect.InvocationTargetException;
import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.*;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.magicjack.neustar.ws.IristelRunner;
import com.magicjack.webservice.iristel.config.CreatePonsRequestHelper;
import com.magicjack.webservice.iristel.dao.mapper.*;
import com.magicjack.webservice.iristel.domain.vo.*;
import com.magicjack.webservice.iristel.service.IristeService;

import https.LnpCreatePonRequest;

@Component
public class CreatePonProcessor {

    @Autowired
    private SqlSessionFactory sessionFactory;
    
    private static Logger logger = LoggerFactory.getLogger(IristelRunner.class);
    @Autowired
    private IristeService webService;
    
    
    public void shutdownHook() {
        logger.info("Shutting down IristelRunner ...");
    }
    
    private TimerTask readThread = new TimerTask() {
        
        @Override
        public void run(){
            List<CreatePonsRequest> list = new ArrayList<>();
            try(SqlSession session = sessionFactory.openSession()){
                CreatePonsRequestMapper mapper = session.getMapper(CreatePonsRequestMapper.class);
                CreatePonsRequestExample example = new CreatePonsRequestExample();
                example.createCriteria().andIdGreaterThan(0L);        
                list = mapper.selectByExample(example);
                
                //For each pon request get service details and routing details and create web service ready POJO
                for(CreatePonsRequest pon : list) {
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
            }
        }
    };
    
    public TimerTask getReadThread() {
        return readThread;
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
    
}
