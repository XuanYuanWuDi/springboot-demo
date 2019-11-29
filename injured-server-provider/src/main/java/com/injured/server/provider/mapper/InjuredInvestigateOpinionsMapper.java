package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredInvestigateOpinions;
import com.injured.server.api.entity.InjuredInvestigateOpinionsExample;
import com.injured.server.api.model.workbench.DateNum;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InjuredInvestigateOpinionsMapper {
    long countByExample(InjuredInvestigateOpinionsExample example);

    int deleteByExample(InjuredInvestigateOpinionsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredInvestigateOpinions record);

    int insertSelective(InjuredInvestigateOpinions record);

    List<InjuredInvestigateOpinions> selectByExample(InjuredInvestigateOpinionsExample example);

    InjuredInvestigateOpinions selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredInvestigateOpinions record, @Param("example") InjuredInvestigateOpinionsExample example);

    int updateByExample(@Param("record") InjuredInvestigateOpinions record, @Param("example") InjuredInvestigateOpinionsExample example);

    int updateByPrimaryKeySelective(InjuredInvestigateOpinions record);

    int updateByPrimaryKey(InjuredInvestigateOpinions record);

    int selectByStatusUntreated();
    int selectByTodayProcessed(String curtime);
    int selectByWeekProcessed(String mondayOfThisWeek);
    String currentMonth();
    String currentDay();
    List<DateNum> currentMonthProcessed(String curtime);
    List<DateNum> currentDate();



}