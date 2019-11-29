package com.injured.server.provider.mapper;

import com.injured.server.api.entity.CeRegistSurveyCar;
import com.injured.server.api.entity.CeRegistSurveyCarExample;
import java.util.List;

import com.injured.server.provider.db.annotation.DataSource;
import org.apache.ibatis.annotations.Param;

public interface CeRegistSurveyCarMapper {
    @DataSource("slave")
    long countByExample(CeRegistSurveyCarExample example);
    @DataSource("slave")
    int deleteByExample(CeRegistSurveyCarExample example);
    @DataSource("slave")
    int deleteByPrimaryKey(Long id);
    @DataSource("slave")
    int insert(CeRegistSurveyCar record);
    @DataSource("slave")
    int insertSelective(CeRegistSurveyCar record);
    @DataSource("slave")
    List<CeRegistSurveyCar> selectByExample(CeRegistSurveyCarExample example);
    @DataSource("slave")
    CeRegistSurveyCar selectByPrimaryKey(Long id);
    @DataSource("slave")
    int updateByExampleSelective(@Param("record") CeRegistSurveyCar record, @Param("example") CeRegistSurveyCarExample example);
    @DataSource("slave")
    int updateByExample(@Param("record") CeRegistSurveyCar record, @Param("example") CeRegistSurveyCarExample example);
    @DataSource("slave")
    int updateByPrimaryKeySelective(CeRegistSurveyCar record);
    @DataSource("slave")
    int updateByPrimaryKey(CeRegistSurveyCar record);
}