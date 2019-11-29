package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredInfo;
import com.injured.server.api.entity.InjuredInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredInfoMapper {
    long countByExample(InjuredInfoExample example);

    int deleteByExample(InjuredInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredInfo record);

    int insertSelective(InjuredInfo record);

    List<InjuredInfo> selectByExample(InjuredInfoExample example);

    InjuredInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredInfo record, @Param("example") InjuredInfoExample example);

    int updateByExample(@Param("record") InjuredInfo record, @Param("example") InjuredInfoExample example);

    int updateByPrimaryKeySelective(InjuredInfo record);

    int updateByPrimaryKey(InjuredInfo record);
}