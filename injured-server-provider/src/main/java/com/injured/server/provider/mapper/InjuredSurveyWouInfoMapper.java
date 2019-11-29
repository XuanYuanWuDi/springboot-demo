package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredSurveyWouInfo;
import com.injured.server.api.entity.InjuredSurveyWouInfoExample;
import java.util.List;

import com.injured.server.provider.db.annotation.DataSource;
import org.apache.ibatis.annotations.Param;

public interface InjuredSurveyWouInfoMapper {
    @DataSource("slave")
    long countByExample(InjuredSurveyWouInfoExample example);
    @DataSource("slave")
    int deleteByExample(InjuredSurveyWouInfoExample example);
    @DataSource("slave")
    int deleteByPrimaryKey(Long id);
    @DataSource("slave")
    int insert(InjuredSurveyWouInfo record);
    @DataSource("slave")
    int insertSelective(InjuredSurveyWouInfo record);
    @DataSource("slave")
    List<InjuredSurveyWouInfo> selectByExample(InjuredSurveyWouInfoExample example);
    @DataSource("slave")
    InjuredSurveyWouInfo selectByPrimaryKey(Long id);
    @DataSource("slave")
    int updateByExampleSelective(@Param("record") InjuredSurveyWouInfo record, @Param("example") InjuredSurveyWouInfoExample example);
    @DataSource("slave")
    int updateByExample(@Param("record") InjuredSurveyWouInfo record, @Param("example") InjuredSurveyWouInfoExample example);
    @DataSource("slave")
    int updateByPrimaryKeySelective(InjuredSurveyWouInfo record);
    @DataSource("slave")
    int updateByPrimaryKey(InjuredSurveyWouInfo record);
}