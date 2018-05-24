package com.magicjack.webservice.iristel.dao.mapper;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

import com.magicjack.webservice.iristel.domain.vo.CreatePonsRequest;

public class DatabaseUtility {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        String resource = "mybatis-config.xml";
        InputStream inputStream;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    
    public static void createPonsRequest(SqlSession session, CreatePonsRequest ponRequest) {
        //SqlSession session = sqlSessionFactory.openSession();
        long start = System.currentTimeMillis();
        MyMapper mymapper = session.getMapper(MyMapper.class);
        //long id = mymapper.selectNextId();
        //ponRequest.setId(id);
        CreatePonsRequestMapper mapper = session.getMapper(CreatePonsRequestMapper.class);
      
        mapper.insertSelective(ponRequest);
        //session.commit();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
//        AuditFieldMapper afmapper = session.getMapper(AuditFieldMapper.class);
//        AuditField af = new AuditField();
//        af.setId(UUID.randomUUID().toString());
//        af.setReferenceId(acct.getAccountId().toString());
//        af.setReferenceType("ACCOUNT");
//        af.setUpdatedEventId(acct.getUpdatedEventId().toString());
//        afmapper.insertSelective(af);
        
        
    }
    
    public static void main(String[] args) {
        CreatePonsRequest lnp = new CreatePonsRequest();
        lnp.setAuthDate("2018-05-22");
        lnp.setCity("Franklin");
        lnp.setCurrentProviderName("ATT");
        lnp.setDesiredDueDate("2018-06-12");
        lnp.setProvinceState("MB");
        lnp.setEndUserName("MSUN");
        lnp.setHouseNumber("1001");
        lnp.setStreetDirectional("N");
        lnp.setStreetName("Seaboard");
        lnp.setStreetType("NA");
        lnp.setDescriptiveLocation("NA");
        lnp.setFloor("1");
        lnp.setRoom("R");
        lnp.setBuilding("B");
        lnp.setZipCode("R2C 0A1");
        lnp.setServiceType("B");
        lnp.setComments("My Comment");
        lnp.setStreetSuffix("S");
        lnp.setLosingCarrierComments("sorry to lose you, come back!");
        
        long start = System.currentTimeMillis();
        SqlSession session = sqlSessionFactory.openSession();
       
        long end = System.currentTimeMillis();
        
        System.out.println(end-start);
        for(int i=0; i<1000; ) {
            DatabaseUtility.createPonsRequest(session, lnp);
            i++;
            if(i%50==0)session.commit(true);
        }
        
        session.commit();
        start = end;
        end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
