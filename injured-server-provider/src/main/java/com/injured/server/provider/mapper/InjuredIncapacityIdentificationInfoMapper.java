package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredIncapacityIdentificationInfo;
import com.injured.server.api.entity.InjuredIncapacityIdentificationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredIncapacityIdentificationInfoMapper {
    long countByExample(InjuredIncapacityIdentificationInfoExample example);

    int deleteByExample(InjuredIncapacityIdentificationInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredIncapacityIdentificationInfo record);

    int insertSelective(InjuredIncapacityIdentificationInfo record);

    List<InjuredIncapacityIdentificationInfo> selectByExample(InjuredIncapacityIdentificationInfoExample example);

    InjuredIncapacityIdentificationInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredIncapacityIdentificationInfo record, @Param("example") InjuredIncapacityIdentificationInfoExample example);

    int updateByExample(@Param("record") InjuredIncapacityIdentificationInfo record, @Param("example") InjuredIncapacityIdentificationInfoExample example);

    int updateByPrimaryKeySelective(InjuredIncapacityIdentificationInfo record);

    int updateByPrimaryKey(InjuredIncapacityIdentificationInfo record);
}