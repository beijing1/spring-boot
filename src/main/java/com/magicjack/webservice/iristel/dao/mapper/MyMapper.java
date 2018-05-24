package com.magicjack.webservice.iristel.dao.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface MyMapper {

    @Select({
        "select msun.create_pons_seq.nextval as id from dual"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true)
    })
    long selectNextId();
}
