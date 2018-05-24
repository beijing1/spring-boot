package com.magicjack.webservice.iristel.dao.mapper;

import com.magicjack.webservice.iristel.domain.vo.CreatePonsRequestServiceDetail;
import com.magicjack.webservice.iristel.domain.vo.CreatePonsRequestServiceDetailExample;
import com.magicjack.webservice.iristel.domain.vo.CreatePonsRequestServiceDetailKey;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CreatePonsRequestServiceDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    @SelectProvider(type=CreatePonsRequestServiceDetailSqlProvider.class, method="countByExample")
    long countByExample(CreatePonsRequestServiceDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    @DeleteProvider(type=CreatePonsRequestServiceDetailSqlProvider.class, method="deleteByExample")
    int deleteByExample(CreatePonsRequestServiceDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    @Delete({
        "delete from MSUN.CREATE_PONS_REQ_SVS_DETAILS",
        "where ID = #{id,jdbcType=DECIMAL}",
          "and SEQ = #{seq,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(CreatePonsRequestServiceDetailKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    @Insert({
        "insert into MSUN.CREATE_PONS_REQ_SVS_DETAILS (ID, SEQ, ",
        "ACTIVITY, EXISTING_ACCOUNT_NUMBER, ",
        "START_NUMBER, END_NUMBER)",
        "values (#{id,jdbcType=DECIMAL}, #{seq,jdbcType=DECIMAL}, ",
        "#{activity,jdbcType=VARCHAR}, #{existingAccountNumber,jdbcType=VARCHAR}, ",
        "#{startNumber,jdbcType=VARCHAR}, #{endNumber,jdbcType=VARCHAR})"
    })
    int insert(CreatePonsRequestServiceDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    @InsertProvider(type=CreatePonsRequestServiceDetailSqlProvider.class, method="insertSelective")
    int insertSelective(CreatePonsRequestServiceDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    @SelectProvider(type=CreatePonsRequestServiceDetailSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="SEQ", property="seq", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="ACTIVITY", property="activity", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXISTING_ACCOUNT_NUMBER", property="existingAccountNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="START_NUMBER", property="startNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="END_NUMBER", property="endNumber", jdbcType=JdbcType.VARCHAR)
    })
    List<CreatePonsRequestServiceDetail> selectByExample(CreatePonsRequestServiceDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    @Select({
        "select",
        "ID, SEQ, ACTIVITY, EXISTING_ACCOUNT_NUMBER, START_NUMBER, END_NUMBER",
        "from MSUN.CREATE_PONS_REQ_SVS_DETAILS",
        "where ID = #{id,jdbcType=DECIMAL}",
          "and SEQ = #{seq,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="SEQ", property="seq", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="ACTIVITY", property="activity", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXISTING_ACCOUNT_NUMBER", property="existingAccountNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="START_NUMBER", property="startNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="END_NUMBER", property="endNumber", jdbcType=JdbcType.VARCHAR)
    })
    CreatePonsRequestServiceDetail selectByPrimaryKey(CreatePonsRequestServiceDetailKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    @UpdateProvider(type=CreatePonsRequestServiceDetailSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CreatePonsRequestServiceDetail record, @Param("example") CreatePonsRequestServiceDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    @UpdateProvider(type=CreatePonsRequestServiceDetailSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CreatePonsRequestServiceDetail record, @Param("example") CreatePonsRequestServiceDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    @UpdateProvider(type=CreatePonsRequestServiceDetailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CreatePonsRequestServiceDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    @Update({
        "update MSUN.CREATE_PONS_REQ_SVS_DETAILS",
        "set ACTIVITY = #{activity,jdbcType=VARCHAR},",
          "EXISTING_ACCOUNT_NUMBER = #{existingAccountNumber,jdbcType=VARCHAR},",
          "START_NUMBER = #{startNumber,jdbcType=VARCHAR},",
          "END_NUMBER = #{endNumber,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=DECIMAL}",
          "and SEQ = #{seq,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(CreatePonsRequestServiceDetail record);
}