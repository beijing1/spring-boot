/**
 * EspressoDIDTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.magicjack.neustar.ws;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import javax.xml.soap.SOAPElement;

import org.apache.axis.soap.SOAPFactoryImpl;
import org.apache.log4j.Logger;
import org.junit.Test;

import https.*;
import https.holders.*;


public class EspressoDIDTestCase {
    
    private static Logger logger = Logger.getLogger(EspressoDIDTestCase.class);
    private static https.EspressoDIDBindingStub binding;
    private static EspressoDIDLocator endpoint = new EspressoDIDLocator();
    
    @Test
    public void testespressoDIDPortWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(
                new EspressoDIDLocator().getespressoDIDPortAddress());
        javax.xml.rpc.Service service = serviceFactory.createService(url,
                new EspressoDIDLocator().getServiceName());
        assertTrue(service != null);
    }

    private static SOAPElement init() throws Exception{

        endpoint.setespressoDIDPortEndpointAddress("https://connect.espressodid.com/cloud/public/v3/test");
        try {
            binding = (EspressoDIDBindingStub) endpoint.getespressoDIDPort();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        
        SOAPFactoryImpl soapy = new SOAPFactoryImpl();

        SOAPElement creds = soapy.createElement("Credentials");
        SOAPElement username = soapy.createElement("username");
        username.setValue("michael.sun@ymaxcorp.com");
        creds.addChildElement(username);

        SOAPElement password = soapy.createElement("password");
        password.setValue("bE8#yV1@");
        creds.addChildElement(password);
        
        binding.setTimeout(10000);
        binding.setHeader("https://connect.espressodid.com/cloud/public/v3/test", "Credentials", creds);
        
        return creds;
    }
    @Test
    public void test1espressoDIDPortTestConnection() throws Exception {
        // Test operation
        java.lang.String value = null;
        value = binding.testConnection(new java.lang.String("testit"));
        System.out.printf("testConnection = %s", value);
        assertNotNull(value);
    }

    @Test
    public void test2espressoDIDPortLnpGetReport() throws Exception {
        // Test operation
        LnpPonReportArrayHolder holder = new LnpPonReportArrayHolder();
        ErrorFieldArrayHolder errors = new ErrorFieldArrayHolder();
        binding.lnpGetReport("2018-01-01 00:00:00", "2018-01-01 13:59:59", holder, errors);
        
        if (errors.value != null && errors.value.length >0) {
            logger.info("\n\n\n\nErrors:");
            for (ErrorsField r : errors.value) {
                logger.info(r);
            }
        } else {
            logger.info("\n\n\n\ninfo:");
            for (LnpPonReport r : holder.value) {
                System.out.printf("report ====> %s\n", r);
            }
        }
    }

    @Test
    public void test3espressoDIDPortLnpPonLastStatus() throws Exception {

        // Test operation
        //binding.lnpPonLastStatus(new java.lang.String(), new holders.ReturnPonStatusHolder(), new holders.ErrorArrayHolder());
        // TBD - validate results
    }

    @Test
    public void test4espressoDIDPortLnpPonInfoForTelNumber(String phoneNbr) throws Exception {

        LnpPonShortInfoArrayHolder holder = new LnpPonShortInfoArrayHolder();
        ErrorFieldArrayHolder errors = new ErrorFieldArrayHolder();
        
        binding.lnpPonInfoForTelNumber(phoneNbr, holder, errors);
        if (errors.value != null && errors.value.length >0) {
            System.out.println("\n\n\n\nErrors:");
            for (ErrorsField r : errors.value) {
                System.out.println(r);
            }
        } else if(holder.value.length > 0) {
            System.out.printf("ReturnInfoForTelNumber ====> %s\n", holder.value[0].toString());
        }
        // TBD - validate results
    }

    @Test
    public void test5espressoDIDPortLnpPonsStatusFromDate() throws Exception {

        // Test operation
        //binding.lnpPonsStatusFromDate(new java.lang.String());
        // TBD - validate results
    }

    public void test6espressoDIDPortLnpPonsByStatus(String status) throws Exception {
        // Test operation
//        ReturnlnpPonsByStatusHolder holder = new ReturnlnpPonsByStatusHolder();
//        ErrorArrayHolder errors = new ErrorArrayHolder();
//        
//        //binding.lnpPonsByStatus(status, holder, errors);
//
//        if (errors.value != null && errors.value.length >0) {
//            System.out.println("\n\n\n\nErrors:");
//            for (Errors r : errors.value) {
//                System.out.println(r);
//            }
//        } else {
//            System.out.println("\n\n\n\ntest6espressoDIDPortLnpPonsByStatus:");
//            for (String r : holder.value) {
//                System.out.printf("LNP ====> %s\n", r);
//            }
//        }
    }

    @Test
    public void test7espressoDIDPortLnpCreatePons() throws Exception {

        LnpPonShortInfoArrayHolder holder = new LnpPonShortInfoArrayHolder();
        ErrorFieldArrayHolder errors = new ErrorFieldArrayHolder();
        
        LnpCreatePonRequest lnpRequest = new LnpCreatePonRequest();
        
        LnpPonStructure lnp = new LnpPonStructure();
        lnp.setAuth_date("2018-05-22");
        lnp.setCity("Franklin");
        lnp.setCurrent_provider_name("ATT");
        lnp.setDesired_due_date("2018-06-12");
        lnp.setProvince_state("MB");
        lnp.setEnd_user_name("MSUN");
        lnp.setHouse_number("1001");
        lnp.setStreet_directional("N");
        lnp.setStreet_name("Seaboard");
        lnp.setStreet_type("NA");
        lnp.setDescriptive_location("NA");
        lnp.setFloor("");
        lnp.setRoom("");
        lnp.setBuilding("");
        lnp.setZip_code("R2C 0A1");
        lnp.setService_type("B");
        lnp.setComments("");
        lnp.setStreet_suffix("");
        lnp.setLosing_carrier_comments("sorry to lose you, come back!");
        
        LnpSdStructure sd = new LnpSdStructure("Port", "9877655", "2509990003", "");
        lnp.setService_details(new LnpSdStructure[]{sd});
        
        lnpRequest.setPon_data(lnp);
        LnpRoutingStructure routing = new LnpRoutingStructure();
        routing.setDefault_routing_profile(100);
        //LnpRoutingDetails details = new LnpRoutingDetails("", "", 100);
        routing.setDetails(new LnpRoutingDetails[0]);
        lnpRequest.setRouting(routing);
        
        binding.lnpCreatePons(lnpRequest, holder, errors);
        
        if (errors.value != null && errors.value.length >0) {
            System.out.println("\n\n\n\nErrors:");
            for (ErrorsField r : errors.value) {
                System.out.println(r);
            }
        } else if(holder.value.length > 0) {
            for(LnpPonShortInfo i : holder.value) {
                System.out.printf("lnpCreatePons ====> \n%s\t%s\t%s\t%s\t\n", i.getDate_last_update(), 
                        i.getLast_processstatus(), i.getLast_version(), i.getPon());
                
                LnpSdStructure[] sds = i.getService_details();
                for(LnpSdStructure s : sds) {
                    System.out.printf("\"lnpCreatePons ====> \n%s\t%s\t%s\t%s\t%s\n\n\n", s.getActivity(), 
                        s.getEnd_number(), s.getExisting_account_number(), s.getStart_number(), s.getEnd_number());
                }
            }
        }
    }

    @Test
    public void test8espressoDIDPortLnpCancelPon() throws Exception {

        // Time out after a minute
        binding.setTimeout(10000);

        // Test operation
        //binding.lnpCancelPon();
        // TBD - validate results
    }

    @Test
    public void test9espressoDIDPortLnpEditDDD() throws Exception {

        // Time out after a minute
        binding.setTimeout(10000);

        // Test operation
        //binding.lnpEditDDD(new java.lang.String());
        // TBD - validate results
    }

    @Test
    public void test10espressoDIDPortLnpCheckNpaNxxPortability() throws Exception {

        // Test operation
        System.out.println("ExpressoDIDTestCase.lnpCheckNpaNxxPortability(819801, resultHolder, errorHolder)");
        //holders.NpaNxxPortabilityStructureHolder resultHolder = new holders.NpaNxxPortabilityStructureHolder();
        //holders.ErrorArrayHolder errorHolder = new holders.ErrorArrayHolder();

//        binding.lnpCheckNpaNxxPortability(819801, resultHolder, errorHolder);
//        System.out.println(resultHolder.value.getIs_portable());
//        System.out.println(errorHolder.value[0].getCode());
//        System.out.println(errorHolder.value[0].getMessage());
        // Test operation
        // TBD - validate results
    }

    @Test
    public void test11espressoDIDPortLnpEditPon() throws Exception {

        // Test operation
        //binding.lnpEditPon(new PonArrayStruct());
        // TBD - validate results
    }

    public static void main(String[] args) throws Exception {

        init();
        args[0] = "1";
        EspressoDIDTestCase testCase = new EspressoDIDTestCase();
        try {
            switch(args[0]) {
                case "1":
                    testCase.test1espressoDIDPortTestConnection();
                    break;
                case "2":
                    testCase.test2espressoDIDPortLnpGetReport();
                    break;
                case "4":
                    testCase.test4espressoDIDPortLnpPonInfoForTelNumber(args[1]);
                    break;
                case "6":
                    testCase.test6espressoDIDPortLnpPonsByStatus(args[1]);
                    break;
                case "7":
                    testCase.test7espressoDIDPortLnpCreatePons();;
                    break;
                default:
                    System.out.println("Please enter option");
               
            }  
            
            logger.info("Operation " + args[0] + " DONE");
        } catch (Exception ex) {
            logger.error(ex);
        }
    }
}