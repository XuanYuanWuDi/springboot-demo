package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredRaisePersonInfo;
import com.injured.server.api.entity.InjuredRaisePersonInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredRaisePersonInfoMapper {
    long countByExample(InjuredRaisePersonInfoExample example);

    int deleteByExample(InjuredRaisePersonInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredRaisePersonInfo record);

    int insertSelective(InjuredRaisePersonInfo record);

    List<InjuredRaisePersonInfo> selectByExample(InjuredRaisePersonInfoExample example);

    InjuredRaisePersonInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredRaisePersonInfo record, @Param("example") InjuredRaisePersonInfoExample example);

    int updateByExample(@Param("record") InjuredRaisePersonInfo record, @Param("example") InjuredRaisePersonInfoExample example);

    int updateByPrimaryKeySelective(InjuredRaisePersonInfo record);

    int updateByPrimaryKey(InjuredRaisePersonInfo record);
}