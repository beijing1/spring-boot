package com.magicjack.webservice.iristel.dao.mapper;

import com.magicjack.webservice.iristel.domain.vo.CreatePonsRequest;
import com.magicjack.webservice.iristel.domain.vo.CreatePonsRequestExample.Criteria;
import com.magicjack.webservice.iristel.domain.vo.CreatePonsRequestExample.Criterion;
import com.magicjack.webservice.iristel.domain.vo.CreatePonsRequestExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class CreatePonsRequestSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQUEST
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    public String countByExample(CreatePonsRequestExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("\"MSUN\".\"CREATE_PONS_REQUEST\"");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQUEST
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    public String deleteByExample(CreatePonsRequestExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("\"MSUN\".\"CREATE_PONS_REQUEST\"");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQUEST
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    public String insertSelective(CreatePonsRequest record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("\"MSUN\".\"CREATE_PONS_REQUEST\"");
        
        if (record.getId() != null) {
            sql.VALUES("\"ID\"", "#{id,jdbcType=DECIMAL}");
        }
        
        if (record.getServiceType() != null) {
            sql.VALUES("\"SERVICE_TYPE\"", "#{serviceType,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentProviderName() != null) {
            sql.VALUES("\"CURRENT_PROVIDER_NAME\"", "#{currentProviderName,jdbcType=VARCHAR}");
        }
        
        if (record.getDesiredDueDate() != null) {
            sql.VALUES("\"DESIRED_DUE_DATE\"", "#{desiredDueDate,jdbcType=VARCHAR}");
        }
        
        if (record.getAuthDate() != null) {
            sql.VALUES("\"AUTH_DATE\"", "#{authDate,jdbcType=VARCHAR}");
        }
        
        if (record.getEndUserName() != null) {
            sql.VALUES("\"END_USER_NAME\"", "#{endUserName,jdbcType=VARCHAR}");
        }
        
        if (record.getHouseNumber() != null) {
            sql.VALUES("\"HOUSE_NUMBER\"", "#{houseNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getStreetDirectional() != null) {
            sql.VALUES("\"STREET_DIRECTIONAL\"", "#{streetDirectional,jdbcType=VARCHAR}");
        }
        
        if (record.getStreetSuffix() != null) {
            sql.VALUES("\"STREET_SUFFIX\"", "#{streetSuffix,jdbcType=VARCHAR}");
        }
        
        if (record.getStreetName() != null) {
            sql.VALUES("\"STREET_NAME\"", "#{streetName,jdbcType=VARCHAR}");
        }
        
        if (record.getStreetType() != null) {
            sql.VALUES("\"STREET_TYPE\"", "#{streetType,jdbcType=VARCHAR}");
        }
        
        if (record.getDescriptiveLocation() != null) {
            sql.VALUES("\"DESCRIPTIVE_LOCATION\"", "#{descriptiveLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getFloor() != null) {
            sql.VALUES("\"FLOOR\"", "#{floor,jdbcType=VARCHAR}");
        }
        
        if (record.getRoom() != null) {
            sql.VALUES("\"ROOM\"", "#{room,jdbcType=VARCHAR}");
        }
        
        if (record.getBuilding() != null) {
            sql.VALUES("\"BUILDING\"", "#{building,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            sql.VALUES("\"CITY\"", "#{city,jdbcType=VARCHAR}");
        }
        
        if (record.getProvinceState() != null) {
            sql.VALUES("\"PROVINCE_STATE\"", "#{provinceState,jdbcType=VARCHAR}");
        }
        
        if (record.getZipCode() != null) {
            sql.VALUES("\"ZIP_CODE\"", "#{zipCode,jdbcType=VARCHAR}");
        }
        
        if (record.getComments() != null) {
            sql.VALUES("\"COMMENTS\"", "#{comments,jdbcType=VARCHAR}");
        }
        
        if (record.getLosingCarrierComments() != null) {
            sql.VALUES("\"LOSING_CARRIER_COMMENTS\"", "#{losingCarrierComments,jdbcType=VARCHAR}");
        }
        
        if (record.getDefaultRoutingProifle() != null) {
            sql.VALUES("\"DEFAULT_ROUTING_PROIFLE\"", "#{defaultRoutingProifle,jdbcType=DECIMAL}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQUEST
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    public String selectByExample(CreatePonsRequestExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("\"ID\"");
        } else {
            sql.SELECT("\"ID\"");
        }
        sql.SELECT("\"SERVICE_TYPE\"");
        sql.SELECT("\"CURRENT_PROVIDER_NAME\"");
        sql.SELECT("\"DESIRED_DUE_DATE\"");
        sql.SELECT("\"AUTH_DATE\"");
        sql.SELECT("\"END_USER_NAME\"");
        sql.SELECT("\"HOUSE_NUMBER\"");
        sql.SELECT("\"STREET_DIRECTIONAL\"");
        sql.SELECT("\"STREET_SUFFIX\"");
        sql.SELECT("\"STREET_NAME\"");
        sql.SELECT("\"STREET_TYPE\"");
        sql.SELECT("\"DESCRIPTIVE_LOCATION\"");
        sql.SELECT("\"FLOOR\"");
        sql.SELECT("\"ROOM\"");
        sql.SELECT("\"BUILDING\"");
        sql.SELECT("\"CITY\"");
        sql.SELECT("\"PROVINCE_STATE\"");
        sql.SELECT("\"ZIP_CODE\"");
        sql.SELECT("\"COMMENTS\"");
        sql.SELECT("\"LOSING_CARRIER_COMMENTS\"");
        sql.SELECT("\"DEFAULT_ROUTING_PROIFLE\"");
        sql.FROM("\"MSUN\".\"CREATE_PONS_REQUEST\"");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQUEST
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        CreatePonsRequest record = (CreatePonsRequest) parameter.get("record");
        CreatePonsRequestExample example = (CreatePonsRequestExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("\"MSUN\".\"CREATE_PONS_REQUEST\"");
        
        if (record.getId() != null) {
            sql.SET("\"ID\" = #{record.id,jdbcType=DECIMAL}");
        }
        
        if (record.getServiceType() != null) {
            sql.SET("\"SERVICE_TYPE\" = #{record.serviceType,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentProviderName() != null) {
            sql.SET("\"CURRENT_PROVIDER_NAME\" = #{record.currentProviderName,jdbcType=VARCHAR}");
        }
        
        if (record.getDesiredDueDate() != null) {
            sql.SET("\"DESIRED_DUE_DATE\" = #{record.desiredDueDate,jdbcType=VARCHAR}");
        }
        
        if (record.getAuthDate() != null) {
            sql.SET("\"AUTH_DATE\" = #{record.authDate,jdbcType=VARCHAR}");
        }
        
        if (record.getEndUserName() != null) {
            sql.SET("\"END_USER_NAME\" = #{record.endUserName,jdbcType=VARCHAR}");
        }
        
        if (record.getHouseNumber() != null) {
            sql.SET("\"HOUSE_NUMBER\" = #{record.houseNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getStreetDirectional() != null) {
            sql.SET("\"STREET_DIRECTIONAL\" = #{record.streetDirectional,jdbcType=VARCHAR}");
        }
        
        if (record.getStreetSuffix() != null) {
            sql.SET("\"STREET_SUFFIX\" = #{record.streetSuffix,jdbcType=VARCHAR}");
        }
        
        if (record.getStreetName() != null) {
            sql.SET("\"STREET_NAME\" = #{record.streetName,jdbcType=VARCHAR}");
        }
        
        if (record.getStreetType() != null) {
            sql.SET("\"STREET_TYPE\" = #{record.streetType,jdbcType=VARCHAR}");
        }
        
        if (record.getDescriptiveLocation() != null) {
            sql.SET("\"DESCRIPTIVE_LOCATION\" = #{record.descriptiveLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getFloor() != null) {
            sql.SET("\"FLOOR\" = #{record.floor,jdbcType=VARCHAR}");
        }
        
        if (record.getRoom() != null) {
            sql.SET("\"ROOM\" = #{record.room,jdbcType=VARCHAR}");
        }
        
        if (record.getBuilding() != null) {
            sql.SET("\"BUILDING\" = #{record.building,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            sql.SET("\"CITY\" = #{record.city,jdbcType=VARCHAR}");
        }
        
        if (record.getProvinceState() != null) {
            sql.SET("\"PROVINCE_STATE\" = #{record.provinceState,jdbcType=VARCHAR}");
        }
        
        if (record.getZipCode() != null) {
            sql.SET("\"ZIP_CODE\" = #{record.zipCode,jdbcType=VARCHAR}");
        }
        
        if (record.getComments() != null) {
            sql.SET("\"COMMENTS\" = #{record.comments,jdbcType=VARCHAR}");
        }
        
        if (record.getLosingCarrierComments() != null) {
            sql.SET("\"LOSING_CARRIER_COMMENTS\" = #{record.losingCarrierComments,jdbcType=VARCHAR}");
        }
        
        if (record.getDefaultRoutingProifle() != null) {
            sql.SET("\"DEFAULT_ROUTING_PROIFLE\" = #{record.defaultRoutingProifle,jdbcType=DECIMAL}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQUEST
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("\"MSUN\".\"CREATE_PONS_REQUEST\"");
        
        sql.SET("\"ID\" = #{record.id,jdbcType=DECIMAL}");
        sql.SET("\"SERVICE_TYPE\" = #{record.serviceType,jdbcType=VARCHAR}");
        sql.SET("\"CURRENT_PROVIDER_NAME\" = #{record.currentProviderName,jdbcType=VARCHAR}");
        sql.SET("\"DESIRED_DUE_DATE\" = #{record.desiredDueDate,jdbcType=VARCHAR}");
        sql.SET("\"AUTH_DATE\" = #{record.authDate,jdbcType=VARCHAR}");
        sql.SET("\"END_USER_NAME\" = #{record.endUserName,jdbcType=VARCHAR}");
        sql.SET("\"HOUSE_NUMBER\" = #{record.houseNumber,jdbcType=VARCHAR}");
        sql.SET("\"STREET_DIRECTIONAL\" = #{record.streetDirectional,jdbcType=VARCHAR}");
        sql.SET("\"STREET_SUFFIX\" = #{record.streetSuffix,jdbcType=VARCHAR}");
        sql.SET("\"STREET_NAME\" = #{record.streetName,jdbcType=VARCHAR}");
        sql.SET("\"STREET_TYPE\" = #{record.streetType,jdbcType=VARCHAR}");
        sql.SET("\"DESCRIPTIVE_LOCATION\" = #{record.descriptiveLocation,jdbcType=VARCHAR}");
        sql.SET("\"FLOOR\" = #{record.floor,jdbcType=VARCHAR}");
        sql.SET("\"ROOM\" = #{record.room,jdbcType=VARCHAR}");
        sql.SET("\"BUILDING\" = #{record.building,jdbcType=VARCHAR}");
        sql.SET("\"CITY\" = #{record.city,jdbcType=VARCHAR}");
        sql.SET("\"PROVINCE_STATE\" = #{record.provinceState,jdbcType=VARCHAR}");
        sql.SET("\"ZIP_CODE\" = #{record.zipCode,jdbcType=VARCHAR}");
        sql.SET("\"COMMENTS\" = #{record.comments,jdbcType=VARCHAR}");
        sql.SET("\"LOSING_CARRIER_COMMENTS\" = #{record.losingCarrierComments,jdbcType=VARCHAR}");
        sql.SET("\"DEFAULT_ROUTING_PROIFLE\" = #{record.defaultRoutingProifle,jdbcType=DECIMAL}");
        
        CreatePonsRequestExample example = (CreatePonsRequestExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQUEST
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    public String updateByPrimaryKeySelective(CreatePonsRequest record) {
        SQL sql = new SQL();
        sql.UPDATE("\"MSUN\".\"CREATE_PONS_REQUEST\"");
        
        if (record.getServiceType() != null) {
            sql.SET("\"SERVICE_TYPE\" = #{serviceType,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentProviderName() != null) {
            sql.SET("\"CURRENT_PROVIDER_NAME\" = #{currentProviderName,jdbcType=VARCHAR}");
        }
        
        if (record.getDesiredDueDate() != null) {
            sql.SET("\"DESIRED_DUE_DATE\" = #{desiredDueDate,jdbcType=VARCHAR}");
        }
        
        if (record.getAuthDate() != null) {
            sql.SET("\"AUTH_DATE\" = #{authDate,jdbcType=VARCHAR}");
        }
        
        if (record.getEndUserName() != null) {
            sql.SET("\"END_USER_NAME\" = #{endUserName,jdbcType=VARCHAR}");
        }
        
        if (record.getHouseNumber() != null) {
            sql.SET("\"HOUSE_NUMBER\" = #{houseNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getStreetDirectional() != null) {
            sql.SET("\"STREET_DIRECTIONAL\" = #{streetDirectional,jdbcType=VARCHAR}");
        }
        
        if (record.getStreetSuffix() != null) {
            sql.SET("\"STREET_SUFFIX\" = #{streetSuffix,jdbcType=VARCHAR}");
        }
        
        if (record.getStreetName() != null) {
            sql.SET("\"STREET_NAME\" = #{streetName,jdbcType=VARCHAR}");
        }
        
        if (record.getStreetType() != null) {
            sql.SET("\"STREET_TYPE\" = #{streetType,jdbcType=VARCHAR}");
        }
        
        if (record.getDescriptiveLocation() != null) {
            sql.SET("\"DESCRIPTIVE_LOCATION\" = #{descriptiveLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getFloor() != null) {
            sql.SET("\"FLOOR\" = #{floor,jdbcType=VARCHAR}");
        }
        
        if (record.getRoom() != null) {
            sql.SET("\"ROOM\" = #{room,jdbcType=VARCHAR}");
        }
        
        if (record.getBuilding() != null) {
            sql.SET("\"BUILDING\" = #{building,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            sql.SET("\"CITY\" = #{city,jdbcType=VARCHAR}");
        }
        
        if (record.getProvinceState() != null) {
            sql.SET("\"PROVINCE_STATE\" = #{provinceState,jdbcType=VARCHAR}");
        }
        
        if (record.getZipCode() != null) {
            sql.SET("\"ZIP_CODE\" = #{zipCode,jdbcType=VARCHAR}");
        }
        
        if (record.getComments() != null) {
            sql.SET("\"COMMENTS\" = #{comments,jdbcType=VARCHAR}");
        }
        
        if (record.getLosingCarrierComments() != null) {
            sql.SET("\"LOSING_CARRIER_COMMENTS\" = #{losingCarrierComments,jdbcType=VARCHAR}");
        }
        
        if (record.getDefaultRoutingProifle() != null) {
            sql.SET("\"DEFAULT_ROUTING_PROIFLE\" = #{defaultRoutingProifle,jdbcType=DECIMAL}");
        }
        
        sql.WHERE("\"ID\" = #{id,jdbcType=DECIMAL}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQUEST
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    protected void applyWhere(SQL sql, CreatePonsRequestExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}