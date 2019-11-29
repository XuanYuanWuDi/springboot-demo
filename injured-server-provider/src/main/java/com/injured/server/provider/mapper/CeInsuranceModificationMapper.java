package com.injured.server.provider.mapper;

import com.injured.server.api.entity.CeInsuranceModification;
import com.injured.server.api.entity.CeInsuranceModificationExample;
import java.util.List;

import com.injured.server.provider.db.annotation.DataSource;
import org.apache.ibatis.annotations.Param;

public interface CeInsuranceModificationMapper {
    @DataSource("slave")
    long countByExample(CeInsuranceModificationExample example);
    @DataSource("slave")
    int deleteByExample(CeInsuranceModificationExample example);
    @DataSource("slave")
    int deleteByPrimaryKey(Long id);
    @DataSource("slave")
    int insert(CeInsuranceModification record);
    @DataSource("slave")
    int insertSelective(CeInsuranceModification record);
    @DataSource("slave")
    List<CeInsuranceModification> selectByExample(CeInsuranceModificationExample example);
    @DataSource("slave")
    CeInsuranceModification selectByPrimaryKey(Long id);
    @DataSource("slave")
    int updateByExampleSelective(@Param("record") CeInsuranceModification record, @Param("example") CeInsuranceModificationExample example);
    @DataSource("slave")
    int updateByExample(@Param("record") CeInsuranceModification record, @Param("example") CeInsuranceModificationExample example);
    @DataSource("slave")
    int updateByPrimaryKeySelective(CeInsuranceModification record);
    @DataSource("slave")
    int updateByPrimaryKey(CeInsuranceModification record);
}