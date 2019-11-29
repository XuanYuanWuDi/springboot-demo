package com.injured.server.provider.mapper;

import com.injured.server.api.entity.CeInsuranceItem;
import com.injured.server.api.entity.CeInsuranceItemExample;
import java.util.List;

import com.injured.server.provider.db.annotation.DataSource;
import org.apache.ibatis.annotations.Param;

public interface CeInsuranceItemMapper {
    @DataSource("slave")
    long countByExample(CeInsuranceItemExample example);
    @DataSource("slave")
    int deleteByExample(CeInsuranceItemExample example);
    @DataSource("slave")
    int deleteByPrimaryKey(Long id);
    @DataSource("slave")
    int insert(CeInsuranceItem record);
    @DataSource("slave")
    int insertSelective(CeInsuranceItem record);
    @DataSource("slave")
    List<CeInsuranceItem> selectByExample(CeInsuranceItemExample example);
    @DataSource("slave")
    CeInsuranceItem selectByPrimaryKey(Long id);
    @DataSource("slave")
    int updateByExampleSelective(@Param("record") CeInsuranceItem record, @Param("example") CeInsuranceItemExample example);
    @DataSource("slave")
    int updateByExample(@Param("record") CeInsuranceItem record, @Param("example") CeInsuranceItemExample example);
    @DataSource("slave")
    int updateByPrimaryKeySelective(CeInsuranceItem record);
    @DataSource("slave")
    int updateByPrimaryKey(CeInsuranceItem record);
    @DataSource("slave")
    List<CeInsuranceItem> selectByBatchInstanceId(List<Long> instanceIds);
}