package com.injured.server.provider.mapper;

import com.injured.server.api.entity.CeRegistSurveyCarDriver;
import com.injured.server.api.entity.CeRegistSurveyCarDriverExample;
import java.util.List;

import com.injured.server.provider.db.annotation.DataSource;
import org.apache.ibatis.annotations.Param;

public interface CeRegistSurveyCarDriverMapper {
    @DataSource("slave")
    long countByExample(CeRegistSurveyCarDriverExample example);
    @DataSource("slave")
    int deleteByExample(CeRegistSurveyCarDriverExample example);
    @DataSource("slave")
    int deleteByPrimaryKey(Long id);
    @DataSource("slave")
    int insert(CeRegistSurveyCarDriver record);
    @DataSource("slave")
    int insertSelective(CeRegistSurveyCarDriver record);
    @DataSource("slave")
    List<CeRegistSurveyCarDriver> selectByExample(CeRegistSurveyCarDriverExample example);
    @DataSource("slave")
    CeRegistSurveyCarDriver selectByPrimaryKey(Long id);
    @DataSource("slave")
    int updateByExampleSelective(@Param("record") CeRegistSurveyCarDriver record, @Param("example") CeRegistSurveyCarDriverExample example);
    @DataSource("slave")
    int updateByExample(@Param("record") CeRegistSurveyCarDriver record, @Param("example") CeRegistSurveyCarDriverExample example);
    @DataSource("slave")
    int updateByPrimaryKeySelective(CeRegistSurveyCarDriver record);
    @DataSource("slave")
    int updateByPrimaryKey(CeRegistSurveyCarDriver record);
}