package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredHouseholdRegistInfo;
import com.injured.server.api.entity.InjuredHouseholdRegistInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredHouseholdRegistInfoMapper {
    long countByExample(InjuredHouseholdRegistInfoExample example);

    int deleteByExample(InjuredHouseholdRegistInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredHouseholdRegistInfo record);

    int insertSelective(InjuredHouseholdRegistInfo record);

    List<InjuredHouseholdRegistInfo> selectByExample(InjuredHouseholdRegistInfoExample example);

    InjuredHouseholdRegistInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredHouseholdRegistInfo record, @Param("example") InjuredHouseholdRegistInfoExample example);

    int updateByExample(@Param("record") InjuredHouseholdRegistInfo record, @Param("example") InjuredHouseholdRegistInfoExample example);

    int updateByPrimaryKeySelective(InjuredHouseholdRegistInfo record);

    int updateByPrimaryKey(InjuredHouseholdRegistInfo record);
}