package com.injured.server.provider.mapper;

import com.injured.server.api.entity.CeRegistSurveyLoss;
import com.injured.server.api.entity.CeRegistSurveyLossExample;
import java.util.List;

import com.injured.server.provider.db.annotation.DataSource;
import org.apache.ibatis.annotations.Param;

public interface CeRegistSurveyLossMapper {
    @DataSource("slave")
    long countByExample(CeRegistSurveyLossExample example);
    @DataSource("slave")
    int deleteByExample(CeRegistSurveyLossExample example);
    @DataSource("slave")
    int deleteByPrimaryKey(Long id);
    @DataSource("slave")
    int insert(CeRegistSurveyLoss record);
    @DataSource("slave")
    int insertSelective(CeRegistSurveyLoss record);
    @DataSource("slave")
    List<CeRegistSurveyLoss> selectByExample(CeRegistSurveyLossExample example);
    @DataSource("slave")
    CeRegistSurveyLoss selectByPrimaryKey(Long id);
    @DataSource("slave")
    int updateByExampleSelective(@Param("record") CeRegistSurveyLoss record, @Param("example") CeRegistSurveyLossExample example);
    @DataSource("slave")
    int updateByExample(@Param("record") CeRegistSurveyLoss record, @Param("example") CeRegistSurveyLossExample example);
    @DataSource("slave")
    int updateByPrimaryKeySelective(CeRegistSurveyLoss record);
    @DataSource("slave")
    int updateByPrimaryKey(CeRegistSurveyLoss record);
}