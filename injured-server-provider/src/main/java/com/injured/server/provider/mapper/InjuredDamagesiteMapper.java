package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredDamagesite;
import com.injured.server.api.entity.InjuredDamagesiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredDamagesiteMapper {
    long countByExample(InjuredDamagesiteExample example);

    int deleteByExample(InjuredDamagesiteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredDamagesite record);

    int insertSelective(InjuredDamagesite record);

    List<InjuredDamagesite> selectByExample(InjuredDamagesiteExample example);

    InjuredDamagesite selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredDamagesite record, @Param("example") InjuredDamagesiteExample example);

    int updateByExample(@Param("record") InjuredDamagesite record, @Param("example") InjuredDamagesiteExample example);

    int updateByPrimaryKeySelective(InjuredDamagesite record);

    int updateByPrimaryKey(InjuredDamagesite record);
}