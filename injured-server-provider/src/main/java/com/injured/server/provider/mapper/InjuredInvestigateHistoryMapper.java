package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredInvestigateHistory;
import com.injured.server.api.entity.InjuredInvestigateHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredInvestigateHistoryMapper {
    long countByExample(InjuredInvestigateHistoryExample example);

    int deleteByExample(InjuredInvestigateHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredInvestigateHistory record);

    int insertSelective(InjuredInvestigateHistory record);

    List<InjuredInvestigateHistory> selectByExample(InjuredInvestigateHistoryExample example);

    InjuredInvestigateHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredInvestigateHistory record, @Param("example") InjuredInvestigateHistoryExample example);

    int updateByExample(@Param("record") InjuredInvestigateHistory record, @Param("example") InjuredInvestigateHistoryExample example);

    int updateByPrimaryKeySelective(InjuredInvestigateHistory record);

    int updateByPrimaryKey(InjuredInvestigateHistory record);
}