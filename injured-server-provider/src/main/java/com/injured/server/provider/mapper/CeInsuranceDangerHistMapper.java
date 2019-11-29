package com.injured.server.provider.mapper;

import com.injured.server.api.entity.CeInsuranceDangerHist;
import com.injured.server.api.entity.CeInsuranceDangerHistExample;
import java.util.List;

import com.injured.server.provider.db.annotation.DataSource;
import org.apache.ibatis.annotations.Param;

public interface CeInsuranceDangerHistMapper {
    @DataSource("slave")
    long countByExample(CeInsuranceDangerHistExample example);
    @DataSource("slave")
    int deleteByExample(CeInsuranceDangerHistExample example);
    @DataSource("slave")
    int deleteByPrimaryKey(Long id);
    @DataSource("slave")
    int insert(CeInsuranceDangerHist record);
    @DataSource("slave")
    int insertSelective(CeInsuranceDangerHist record);
    @DataSource("slave")
    List<CeInsuranceDangerHist> selectByExample(CeInsuranceDangerHistExample example);
    @DataSource("slave")
    CeInsuranceDangerHist selectByPrimaryKey(Long id);
    @DataSource("slave")
    int updateByExampleSelective(@Param("record") CeInsuranceDangerHist record, @Param("example") CeInsuranceDangerHistExample example);
    @DataSource("slave")
    int updateByExample(@Param("record") CeInsuranceDangerHist record, @Param("example") CeInsuranceDangerHistExample example);
    @DataSource("slave")
    int updateByPrimaryKeySelective(CeInsuranceDangerHist record);
    @DataSource("slave")
    int updateByPrimaryKey(CeInsuranceDangerHist record);
}