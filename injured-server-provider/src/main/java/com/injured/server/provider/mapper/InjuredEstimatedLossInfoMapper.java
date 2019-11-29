package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredEstimatedLossInfo;
import com.injured.server.api.entity.InjuredEstimatedLossInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredEstimatedLossInfoMapper {
    long countByExample(InjuredEstimatedLossInfoExample example);

    int deleteByExample(InjuredEstimatedLossInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredEstimatedLossInfo record);

    int insertSelective(InjuredEstimatedLossInfo record);

    List<InjuredEstimatedLossInfo> selectByExample(InjuredEstimatedLossInfoExample example);

    InjuredEstimatedLossInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredEstimatedLossInfo record, @Param("example") InjuredEstimatedLossInfoExample example);

    int updateByExample(@Param("record") InjuredEstimatedLossInfo record, @Param("example") InjuredEstimatedLossInfoExample example);

    int updateByPrimaryKeySelective(InjuredEstimatedLossInfo record);

    int updateByPrimaryKey(InjuredEstimatedLossInfo record);
}