/**
 * EspressoDIDTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.magicjack.webservice.iristel.service;

import java.rmi.RemoteException;
import java.sql.Timestamp;

import javax.annotation.PostConstruct;
import javax.xml.soap.SOAPElement;

import org.apache.axis.soap.SOAPFactoryImpl;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.magicjack.webservice.iristel.dao.mapper.CreatePonResponseErrorsMapper;
import com.magicjack.webservice.iristel.domain.vo.CreatePonResponseErrors;

import https.*;
import https.holders.ErrorFieldArrayHolder;
import https.holders.LnpPonShortInfoArrayHolder;

@Service
public class IristeService {
    
    @Value("${iristel.system.user}")
    private String systemUser;
    
    @Value("${iristel.endpoint.url}")
    private String endpointUrl;
    
    @Value("${iristel.endpoint.password}")
    private String endpointPassword;
    
    @Value("${iristel.endpoint.username}")
    private String endpointUsername;
    
    @Value("${iristel.endpoint.timeout.ms}")
    private int timeout = 20000;
    
    private static Logger logger = LoggerFactory.getLogger(IristeService.class);
    private static https.EspressoDIDBindingStub binding;
    private static EspressoDIDLocator endpoint = new EspressoDIDLocator();
    
    @PostConstruct
    private SOAPElement init() throws Exception{

        endpoint.setespressoDIDPortEndpointAddress(endpointUrl);
        binding = (EspressoDIDBindingStub) endpoint.getespressoDIDPort();
        
        SOAPFactoryImpl soapy = new SOAPFactoryImpl();

        SOAPElement creds = soapy.createElement("Credentials");
        SOAPElement username = soapy.createElement("username");
        username.setValue(endpointUsername);
        creds.addChildElement(username);

        SOAPElement password = soapy.createElement("password");
        password.setValue(endpointPassword);
        creds.addChildElement(password);
        
        binding.setTimeout(timeout);
        binding.setHeader("iristel", "Credentials", creds);
        
        return creds;
    }

    public String createPons(Long id, LnpCreatePonRequest lnpRequest, SqlSession session) throws RemoteException {
        String pon = "";
        LnpPonShortInfoArrayHolder holder = new LnpPonShortInfoArrayHolder();
        ErrorFieldArrayHolder errors = new ErrorFieldArrayHolder();
        
        binding.lnpCreatePons(lnpRequest, holder, errors);
        
        if (errors.value != null && errors.value.length >0) {
            CreatePonResponseErrorsMapper mapper = session.getMapper(CreatePonResponseErrorsMapper.class);
            for (ErrorsField r : errors.value) {
                logger.info("{}, {}, {}\n", r.getCode(), r.getMessage(), r.getArray_key());
                CreatePonResponseErrors err = new CreatePonResponseErrors();
                err.setArrayKey(r.getArray_key());
                err.setCode(r.getCode()+"");
                err.setId(id);
                err.setMessage(r.getMessage());
                err.setRegardingField(r.getRegarding_field());
                err.setCreatedBy(systemUser);
                err.setCreatedTs(new Timestamp(System.currentTimeMillis()));
                mapper.insertSelective(err);
            }
        } else {
            for(LnpPonShortInfo i : holder.value) {
                pon = i.getPon();
                logger.debug("lnpCreatePons ====> \n{}\t{}\t{}\t{}\t\n", i.getDate_last_update(), 
                        i.getLast_processstatus(), i.getLast_version(), i.getPon());
                //map.put(i.get, value)
                LnpSdStructure[] sds = i.getService_details();
                for(LnpSdStructure s : sds) {
                    logger.debug(String.format("\"lnpCreatePons ====> \n%s\t%s\t%s\t%s\t%s\n\n\n", s.getActivity(), 
                        s.getEnd_number(), s.getExisting_account_number(), s.getStart_number(), s.getEnd_number(), i.getPon()));
                }
            }
        }
        return pon;
    }
}