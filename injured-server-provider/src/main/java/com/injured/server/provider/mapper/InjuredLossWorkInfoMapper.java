package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredLossWorkInfo;
import com.injured.server.api.entity.InjuredLossWorkInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredLossWorkInfoMapper {
    long countByExample(InjuredLossWorkInfoExample example);

    int deleteByExample(InjuredLossWorkInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredLossWorkInfo record);

    int insertSelective(InjuredLossWorkInfo record);

    List<InjuredLossWorkInfo> selectByExample(InjuredLossWorkInfoExample example);

    InjuredLossWorkInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredLossWorkInfo record, @Param("example") InjuredLossWorkInfoExample example);

    int updateByExample(@Param("record") InjuredLossWorkInfo record, @Param("example") InjuredLossWorkInfoExample example);

    int updateByPrimaryKeySelective(InjuredLossWorkInfo record);

    int updateByPrimaryKey(InjuredLossWorkInfo record);
}