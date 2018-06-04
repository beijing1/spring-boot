package com.magicjack.webservice.iristel.dao.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import com.magicjack.webservice.iristel.domain.vo.CreatePonsRequest;

@Mapper
public interface MyMapper {

    @Select({
        "select msun.create_pons_seq.nextval as id from dual"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true)
    })
    long selectNextId();
    
    @Insert({
        "insert into \"MSUN\".\"CREATE_PONS_REQUEST\" (\"ID\", \"SERVICE_TYPE\", ",
        "\"CURRENT_PROVIDER_NAME\", \"DESIRED_DUE_DATE\", ",
        "\"AUTH_DATE\", \"END_USER_NAME\", ",
        "\"HOUSE_NUMBER\", \"STREET_DIRECTIONAL\", ",
        "\"STREET_SUFFIX\", \"STREET_NAME\", ",
        "\"STREET_TYPE\", \"DESCRIPTIVE_LOCATION\", ",
        "\"FLOOR\", \"ROOM\", \"BUILDING\", ",
        "\"CITY\", \"PROVINCE_STATE\", ",
        "\"ZIP_CODE\", \"COMMENTS\", ",
        "\"LOSING_CARRIER_COMMENTS\", \"DEFAULT_ROUTING_PROIFLE\", ",
        "\"CREATED_BY\", \"CREATED_TS\")",
        "values (#{id,jdbcType=DECIMAL}, #{serviceType,jdbcType=VARCHAR}, ",
        "#{currentProviderName,jdbcType=VARCHAR}, #{desiredDueDate,jdbcType=VARCHAR}, ",
        "#{authDate,jdbcType=VARCHAR}, #{endUserName,jdbcType=VARCHAR}, ",
        "#{houseNumber,jdbcType=VARCHAR}, #{streetDirectional,jdbcType=VARCHAR}, ",
        "#{streetSuffix,jdbcType=VARCHAR}, #{streetName,jdbcType=VARCHAR}, ",
        "#{streetType,jdbcType=VARCHAR}, #{descriptiveLocation,jdbcType=VARCHAR}, ",
        "#{floor,jdbcType=VARCHAR}, #{room,jdbcType=VARCHAR}, #{building,jdbcType=VARCHAR}, ",
        "#{city,jdbcType=VARCHAR}, #{provinceState,jdbcType=VARCHAR}, ",
        "#{zipCode,jdbcType=VARCHAR}, #{comments,jdbcType=VARCHAR}, ",
        "#{losingCarrierComments,jdbcType=VARCHAR}, #{defaultRoutingProifle,jdbcType=DECIMAL}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{createdTs,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="select create_pons_seq.nextval from dual", keyProperty="id", before=true, resultType=long.class)
    int insertCPR(CreatePonsRequest record);
}
