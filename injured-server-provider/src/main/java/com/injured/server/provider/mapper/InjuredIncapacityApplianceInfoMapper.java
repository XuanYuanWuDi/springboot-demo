package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredIncapacityApplianceInfo;
import com.injured.server.api.entity.InjuredIncapacityApplianceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredIncapacityApplianceInfoMapper {
    long countByExample(InjuredIncapacityApplianceInfoExample example);

    int deleteByExample(InjuredIncapacityApplianceInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredIncapacityApplianceInfo record);

    int insertSelective(InjuredIncapacityApplianceInfo record);

    List<InjuredIncapacityApplianceInfo> selectByExample(InjuredIncapacityApplianceInfoExample example);

    InjuredIncapacityApplianceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredIncapacityApplianceInfo record, @Param("example") InjuredIncapacityApplianceInfoExample example);

    int updateByExample(@Param("record") InjuredIncapacityApplianceInfo record, @Param("example") InjuredIncapacityApplianceInfoExample example);

    int updateByPrimaryKeySelective(InjuredIncapacityApplianceInfo record);

    int updateByPrimaryKey(InjuredIncapacityApplianceInfo record);
}