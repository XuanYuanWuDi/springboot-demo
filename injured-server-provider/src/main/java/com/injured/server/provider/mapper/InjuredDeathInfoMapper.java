package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredDeathInfo;
import com.injured.server.api.entity.InjuredDeathInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredDeathInfoMapper {
    long countByExample(InjuredDeathInfoExample example);

    int deleteByExample(InjuredDeathInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredDeathInfo record);

    int insertSelective(InjuredDeathInfo record);

    List<InjuredDeathInfo> selectByExample(InjuredDeathInfoExample example);

    InjuredDeathInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredDeathInfo record, @Param("example") InjuredDeathInfoExample example);

    int updateByExample(@Param("record") InjuredDeathInfo record, @Param("example") InjuredDeathInfoExample example);

    int updateByPrimaryKeySelective(InjuredDeathInfo record);

    int updateByPrimaryKey(InjuredDeathInfo record);
}