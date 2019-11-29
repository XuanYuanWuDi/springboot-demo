package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredFastCompensatInfo;
import com.injured.server.api.entity.InjuredFastCompensatInfoExample;
import com.injured.server.api.model.query.FastDispatchedWorkerUserNum;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredFastCompensatInfoMapper {
    long countByExample(InjuredFastCompensatInfoExample example);

    int deleteByExample(InjuredFastCompensatInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredFastCompensatInfo record);

    int insertSelective(InjuredFastCompensatInfo record);

    List<InjuredFastCompensatInfo> selectByExample(InjuredFastCompensatInfoExample example);

    InjuredFastCompensatInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredFastCompensatInfo record, @Param("example") InjuredFastCompensatInfoExample example);

    int updateByExample(@Param("record") InjuredFastCompensatInfo record, @Param("example") InjuredFastCompensatInfoExample example);

    int updateByPrimaryKeySelective(InjuredFastCompensatInfo record);

    int updateByPrimaryKey(InjuredFastCompensatInfo record);
    
    List<FastDispatchedWorkerUserNum> selectByBatchRuleIds(List<Long> userIds);

    List<FastDispatchedWorkerUserNum> getUserNum(List<Long> userIds);
}