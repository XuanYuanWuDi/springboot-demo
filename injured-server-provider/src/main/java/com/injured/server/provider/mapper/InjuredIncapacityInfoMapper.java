package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredIncapacityInfo;
import com.injured.server.api.entity.InjuredIncapacityInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredIncapacityInfoMapper {
    long countByExample(InjuredIncapacityInfoExample example);

    int deleteByExample(InjuredIncapacityInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredIncapacityInfo record);

    int insertSelective(InjuredIncapacityInfo record);

    List<InjuredIncapacityInfo> selectByExample(InjuredIncapacityInfoExample example);

    InjuredIncapacityInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredIncapacityInfo record, @Param("example") InjuredIncapacityInfoExample example);

    int updateByExample(@Param("record") InjuredIncapacityInfo record, @Param("example") InjuredIncapacityInfoExample example);

    int updateByPrimaryKeySelective(InjuredIncapacityInfo record);

    int updateByPrimaryKey(InjuredIncapacityInfo record);
}