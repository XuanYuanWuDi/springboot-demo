package com.injured.server.provider.mapper;

import com.injured.server.api.entity.CeRegistSurvey;
import com.injured.server.api.entity.CeRegistSurveyExample;
import java.util.List;

import com.injured.server.provider.db.annotation.DataSource;
import org.apache.ibatis.annotations.Param;

public interface CeRegistSurveyMapper {
    @DataSource("slave")
    long countByExample(CeRegistSurveyExample example);
    @DataSource("slave")
    int deleteByExample(CeRegistSurveyExample example);
    @DataSource("slave")
    int deleteByPrimaryKey(Long id);
    @DataSource("slave")
    int insert(CeRegistSurvey record);
    @DataSource("slave")
    int insertSelective(CeRegistSurvey record);
    @DataSource("slave")
    List<CeRegistSurvey> selectByExample(CeRegistSurveyExample example);
    @DataSource("slave")
    CeRegistSurvey selectByPrimaryKey(Long id);
    @DataSource("slave")
    int updateByExampleSelective(@Param("record") CeRegistSurvey record, @Param("example") CeRegistSurveyExample example);
    @DataSource("slave")
    int updateByExample(@Param("record") CeRegistSurvey record, @Param("example") CeRegistSurveyExample example);
    @DataSource("slave")
    int updateByPrimaryKeySelective(CeRegistSurvey record);
    @DataSource("slave")
    int updateByPrimaryKey(CeRegistSurvey record);
}