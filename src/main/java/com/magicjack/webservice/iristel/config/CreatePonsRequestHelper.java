package com.magicjack.webservice.iristel.config;

import java.util.List;

import org.apache.commons.lang.RandomStringUtils;

import com.magicjack.webservice.iristel.domain.vo.*;

import https.*;

public class CreatePonsRequestHelper {

    public enum PortAction{
        Port("Port"), Cancel("Cancel");
        
        private String action;
        
        PortAction(String action) {
            this.action = action;
        }
        
        public String getAction() {
            return action;
        }
    }
    public static LnpCreatePonRequest mapCreatePonRequest(CreatePonsRequest po, List<CPReqServiceDetail> sdList, List<CPReqRoutingDetail> rdList) {
        
        LnpPonStructure ponStructure = new LnpPonStructure();
        LnpRoutingStructure routingStructure = new LnpRoutingStructure();
        LnpCreatePonRequest lnp = new LnpCreatePonRequest(ponStructure, routingStructure);
        
        ponStructure.setAuth_date(po.getAuthDate());
        ponStructure.setCity(po.getCity());
        ponStructure.setCurrent_provider_name(po.getCurrentProviderName());
        ponStructure.setDesired_due_date(po.getDesiredDueDate());
        ponStructure.setProvince_state(po.getProvinceState());
        ponStructure.setEnd_user_name(po.getEndUserName());
        ponStructure.setHouse_number(po.getHouseNumber());
        ponStructure.setStreet_directional(po.getStreetDirectional());
        ponStructure.setStreet_name(po.getStreetName());
        ponStructure.setStreet_suffix(po.getStreetSuffix());
        ponStructure.setStreet_type(po.getStreetType());
        ponStructure.setDescriptive_location(po.getDescriptiveLocation());
        ponStructure.setFloor(po.getFloor());
        ponStructure.setRoom(po.getRoom());
        ponStructure.setBuilding(po.getBuilding());
        ponStructure.setZip_code(po.getZipCode());
        ponStructure.setService_type(po.getServiceType());
        ponStructure.setComments(po.getComments());        
        ponStructure.setLosing_carrier_comments(po.getLosingCarrierComments());
        
        LnpSdStructure[] sdStructures = new LnpSdStructure[sdList.size()];
        ponStructure.setService_details(sdStructures);
        int i = 0;
        for(CPReqServiceDetail sd : sdList) {
            LnpSdStructure sdStruct = new LnpSdStructure();
            sdStructures[i++] = sdStruct;
            sdStruct.setActivity(sd.getActivity());
            sdStruct.setEnd_number(sd.getEndNumber()==null?"":sd.getEndNumber());
            sdStruct.setStart_number(sd.getStartNumber());
            sdStruct.setExisting_account_number(sd.getExistingAccountNumber());
        }

        i = 0;
        LnpRoutingDetails[] routingDetails = new LnpRoutingDetails[rdList.size()];
        routingStructure.setDefault_routing_profile(po.getDefaultRoutingProifle());
        routingStructure.setDetails(routingDetails);
        for(CPReqRoutingDetail rd : rdList) {
            LnpRoutingDetails routing = new LnpRoutingDetails();
            routingDetails[i] = routing;
            routing.setRouting_profile(rd.getRoutingProfile());
            routing.setStart_number(rd.getStartNumber());
            routing.setEnd_number(rd.getEndNumber()==null?"":rd.getEndNumber());
        }
        
        return lnp;
    }
    
    public static CreatePonsRequest createPonsRequest() {
        CreatePonsRequest lnp = new CreatePonsRequest();
        lnp.setAuthDate("2018-05-22");
        lnp.setCity(RandomStringUtils.randomAlphabetic(10));
        lnp.setCurrentProviderName("ATT");
        lnp.setDesiredDueDate("2018-06-12");
        lnp.setProvinceState("MB");
        lnp.setEndUserName("MSUN");
        lnp.setHouseNumber("1001");
        lnp.setStreetDirectional("N");
        lnp.setStreetName(RandomStringUtils.randomAlphabetic(10));
        lnp.setStreetType("NA");
        lnp.setDescriptiveLocation(RandomStringUtils.randomAlphabetic(30));
        lnp.setFloor("1");
        lnp.setRoom("R");
        lnp.setBuilding("B");
        lnp.setZipCode("R2C 0B1");
        lnp.setServiceType("D");
        lnp.setComments(RandomStringUtils.randomAlphabetic(30));
        lnp.setStreetSuffix("S");
        lnp.setLosingCarrierComments("sorry to lose you come back");
        lnp.setDefaultRoutingProifle(409);
        
        return lnp;
    }
    
    public static CPReqRoutingDetail[] createRoutingDetail() {
        CPReqRoutingDetail detail = new CPReqRoutingDetail();
        detail.setRoutingProfile(410);
        detail.setStartNumber("2509991041");
        detail.setEndNumber("");
        
        return new CPReqRoutingDetail[] {detail};
    }
    
    public static CPReqServiceDetail[] createServiceDetail() {
        CPReqServiceDetail sdetail = new CPReqServiceDetail();
        sdetail.setActivity(PortAction.Port.getAction());
        sdetail.setExistingAccountNumber("99999999");
        sdetail.setStartNumber("2509991042");
        sdetail.setEndNumber("2509991043");
        
        CPReqServiceDetail sdetail0 = new CPReqServiceDetail();
        sdetail0.setActivity(PortAction.Port.getAction());
        sdetail0.setExistingAccountNumber("77777777");
        sdetail0.setStartNumber("2509991041");
        sdetail0.setEndNumber("");
        
        return new CPReqServiceDetail[] {sdetail, sdetail0};
    }
}
