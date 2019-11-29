package com.injured.server.provider.mapper;

import com.injured.server.api.entity.CeInsuranceSpecial;
import com.injured.server.api.entity.CeInsuranceSpecialExample;
import java.util.List;

import com.injured.server.provider.db.annotation.DataSource;
import org.apache.ibatis.annotations.Param;

public interface CeInsuranceSpecialMapper {
    @DataSource("slave")
    long countByExample(CeInsuranceSpecialExample example);
    @DataSource("slave")
    int deleteByExample(CeInsuranceSpecialExample example);
    @DataSource("slave")
    int deleteByPrimaryKey(Long id);
    @DataSource("slave")
    int insert(CeInsuranceSpecial record);
    @DataSource("slave")
    int insertSelective(CeInsuranceSpecial record);
    @DataSource("slave")
    List<CeInsuranceSpecial> selectByExample(CeInsuranceSpecialExample example);
    @DataSource("slave")
    CeInsuranceSpecial selectByPrimaryKey(Long id);
    @DataSource("slave")
    int updateByExampleSelective(@Param("record") CeInsuranceSpecial record, @Param("example") CeInsuranceSpecialExample example);
    @DataSource("slave")
    int updateByExample(@Param("record") CeInsuranceSpecial record, @Param("example") CeInsuranceSpecialExample example);
    @DataSource("slave")
    int updateByPrimaryKeySelective(CeInsuranceSpecial record);
    @DataSource("slave")
    int updateByPrimaryKey(CeInsuranceSpecial record);
    @DataSource("slave")
    List<CeInsuranceSpecial> selectByBatchInstanceId(List<Long> instanceIds);
}