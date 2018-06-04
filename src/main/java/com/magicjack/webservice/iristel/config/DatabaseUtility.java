package com.magicjack.webservice.iristel.config;

import java.sql.Timestamp;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.magicjack.webservice.iristel.dao.mapper.*;
import com.magicjack.webservice.iristel.domain.vo.*;

@Component
public class DatabaseUtility {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    
    @Value("${iristel.system.user}")
    private String systemUser = "SYSTEM";
    
    private static Logger logger = LoggerFactory.getLogger(DatabaseUtility.class);

    public SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
    
    public void createPonsRequest(SqlSession session, CreatePonsRequest ponRequest,
            CPReqServiceDetail sds[], CPReqRoutingDetail rds[]) {
        
//        CreatePonsRequestMapper mapper = session.getMapper(CreatePonsRequestMapper.class);
//        mapper.insertSelective(ponRequest);
        MyMapper mapper = session.getMapper(MyMapper.class);
        mapper.insertCPR(ponRequest);
        
        int seq = 0;
        CPReqServiceDetailMapper sdMapper = session.getMapper(CPReqServiceDetailMapper.class);
        for(CPReqServiceDetail sd : sds) {
            sd.setId(ponRequest.getId());
            sd.setSeq(++seq);
            sd.setCreatedBy(systemUser);
            sd.setCreatedTs(new Timestamp(System.currentTimeMillis()));
            sdMapper.insertSelective(sd);
        }
        
        seq = 0;
        CPReqRoutingDetailMapper rdMapper = session.getMapper(CPReqRoutingDetailMapper.class);
        for(CPReqRoutingDetail rd : rds) {
            rd.setId(ponRequest.getId());
            rd.setSeq(++seq);
            rd.setCreatedBy(systemUser);
            rd.setCreatedTs(new Timestamp(System.currentTimeMillis()));
            rdMapper.insertSelective(rd);
        }
    }
    
    public void run(String[] args) {
        
        try(SqlSession session = sqlSessionFactory.openSession()){
            CreatePonsRequest lnp = CreatePonsRequestHelper.createPonsRequest();
            lnp.setCreatedBy(systemUser);
            lnp.setCreatedTs(new Timestamp(System.currentTimeMillis()));
            CPReqServiceDetail sd[] = CreatePonsRequestHelper.createServiceDetail();
            CPReqRoutingDetail rd[] = CreatePonsRequestHelper.createRoutingDetail();
            
            createPonsRequest(session, lnp, sd, rd);
            session.commit();
        }finally {
            sqlSessionFactory = null;
        }
    }
}
