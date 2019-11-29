package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredFixedLossList;
import com.injured.server.api.entity.InjuredFixedLossListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredFixedLossListMapper {
    long countByExample(InjuredFixedLossListExample example);

    int deleteByExample(InjuredFixedLossListExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredFixedLossList record);

    int insertSelective(InjuredFixedLossList record);

    List<InjuredFixedLossList> selectByExample(InjuredFixedLossListExample example);

    InjuredFixedLossList selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredFixedLossList record, @Param("example") InjuredFixedLossListExample example);

    int updateByExample(@Param("record") InjuredFixedLossList record, @Param("example") InjuredFixedLossListExample example);

    int updateByPrimaryKeySelective(InjuredFixedLossList record);

    int updateByPrimaryKey(InjuredFixedLossList record);
    
    int insertBatch(List<InjuredFixedLossList> records);
}