package com.injured.server.provider.mapper;

import com.injured.server.api.entity.CeInsurance;
import com.injured.server.api.entity.CeInsuranceExample;
import java.util.List;

import com.injured.server.provider.db.annotation.DataSource;
import org.apache.ibatis.annotations.Param;

public interface CeInsuranceMapper {
    @DataSource("slave")
    long countByExample(CeInsuranceExample example);
    @DataSource("slave")
    int deleteByExample(CeInsuranceExample example);
    @DataSource("slave")
    int deleteByPrimaryKey(Long id);
    @DataSource("slave")
    int insert(CeInsurance record);
    @DataSource("slave")
    int insertSelective(CeInsurance record);
    @DataSource("slave")
    List<CeInsurance> selectByExample(CeInsuranceExample example);
    @DataSource("slave")
    CeInsurance selectByPrimaryKey(Long id);
    @DataSource("slave")
    int updateByExampleSelective(@Param("record") CeInsurance record, @Param("example") CeInsuranceExample example);
    @DataSource("slave")
    int updateByExample(@Param("record") CeInsurance record, @Param("example") CeInsuranceExample example);
    @DataSource("slave")
    int updateByPrimaryKeySelective(CeInsurance record);
    @DataSource("slave")
    int updateByPrimaryKey(CeInsurance record);
}