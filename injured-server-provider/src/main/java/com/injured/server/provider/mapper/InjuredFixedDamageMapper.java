package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredFixedDamage;
import com.injured.server.api.entity.InjuredFixedDamageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredFixedDamageMapper {
    long countByExample(InjuredFixedDamageExample example);

    int deleteByExample(InjuredFixedDamageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredFixedDamage record);

    int insertSelective(InjuredFixedDamage record);

    List<InjuredFixedDamage> selectByExample(InjuredFixedDamageExample example);

    InjuredFixedDamage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredFixedDamage record, @Param("example") InjuredFixedDamageExample example);

    int updateByExample(@Param("record") InjuredFixedDamage record, @Param("example") InjuredFixedDamageExample example);

    int updateByPrimaryKeySelective(InjuredFixedDamage record);

    int updateByPrimaryKey(InjuredFixedDamage record);
}