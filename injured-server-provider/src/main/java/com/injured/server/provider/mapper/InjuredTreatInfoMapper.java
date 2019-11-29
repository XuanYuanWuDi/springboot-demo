package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredTreatInfo;
import com.injured.server.api.entity.InjuredTreatInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredTreatInfoMapper {
    long countByExample(InjuredTreatInfoExample example);

    int deleteByExample(InjuredTreatInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredTreatInfo record);

    int insertSelective(InjuredTreatInfo record);

    List<InjuredTreatInfo> selectByExample(InjuredTreatInfoExample example);

    InjuredTreatInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredTreatInfo record, @Param("example") InjuredTreatInfoExample example);

    int updateByExample(@Param("record") InjuredTreatInfo record, @Param("example") InjuredTreatInfoExample example);

    int updateByPrimaryKeySelective(InjuredTreatInfo record);

    int updateByPrimaryKey(InjuredTreatInfo record);
}