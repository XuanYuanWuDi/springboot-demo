package com.injured.server.provider.mapper;

import com.injured.server.api.entity.CeInsuranceCompany;
import com.injured.server.api.entity.CeInsuranceCompanyExample;
import java.util.List;

import com.injured.server.provider.db.annotation.DataSource;
import org.apache.ibatis.annotations.Param;

public interface CeInsuranceCompanyMapper{
    @DataSource("slave")
    long countByExample(CeInsuranceCompanyExample example);
    @DataSource("slave")
    int deleteByExample(CeInsuranceCompanyExample example);
    @DataSource("slave")
    int deleteByPrimaryKey(Integer id);
    @DataSource("slave")
    int insert(CeInsuranceCompany record);
    @DataSource("slave")
    int insertSelective(CeInsuranceCompany record);
    @DataSource("slave")
    List<CeInsuranceCompany> selectByExample(CeInsuranceCompanyExample example);
    @DataSource("slave")
    CeInsuranceCompany selectByPrimaryKey(Integer id);
    @DataSource("slave")
    int updateByExampleSelective(@Param("record") CeInsuranceCompany record, @Param("example") CeInsuranceCompanyExample example);
    @DataSource("slave")
    int updateByExample(@Param("record") CeInsuranceCompany record, @Param("example") CeInsuranceCompanyExample example);
    @DataSource("slave")
    int updateByPrimaryKeySelective(CeInsuranceCompany record);
    @DataSource("slave")
    int updateByPrimaryKey(CeInsuranceCompany record);
}