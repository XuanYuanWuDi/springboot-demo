package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredRaiseInfo;
import com.injured.server.api.entity.InjuredRaiseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredRaiseInfoMapper {
    long countByExample(InjuredRaiseInfoExample example);

    int deleteByExample(InjuredRaiseInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredRaiseInfo record);

    int insertSelective(InjuredRaiseInfo record);

    List<InjuredRaiseInfo> selectByExample(InjuredRaiseInfoExample example);

    InjuredRaiseInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredRaiseInfo record, @Param("example") InjuredRaiseInfoExample example);

    int updateByExample(@Param("record") InjuredRaiseInfo record, @Param("example") InjuredRaiseInfoExample example);

    int updateByPrimaryKeySelective(InjuredRaiseInfo record);

    int updateByPrimaryKey(InjuredRaiseInfo record);
}