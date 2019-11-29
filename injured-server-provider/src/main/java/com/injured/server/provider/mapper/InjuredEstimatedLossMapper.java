package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredEstimatedLoss;
import com.injured.server.api.entity.InjuredEstimatedLossExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredEstimatedLossMapper {
    long countByExample(InjuredEstimatedLossExample example);

    int deleteByExample(InjuredEstimatedLossExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredEstimatedLoss record);

    int insertSelective(InjuredEstimatedLoss record);

    List<InjuredEstimatedLoss> selectByExample(InjuredEstimatedLossExample example);

    InjuredEstimatedLoss selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredEstimatedLoss record, @Param("example") InjuredEstimatedLossExample example);

    int updateByExample(@Param("record") InjuredEstimatedLoss record, @Param("example") InjuredEstimatedLossExample example);

    int updateByPrimaryKeySelective(InjuredEstimatedLoss record);

    int updateByPrimaryKey(InjuredEstimatedLoss record);
}