package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredFixedOpinion;
import com.injured.server.api.entity.InjuredFixedOpinionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredFixedOpinionMapper {
    long countByExample(InjuredFixedOpinionExample example);

    int deleteByExample(InjuredFixedOpinionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredFixedOpinion record);

    int insertSelective(InjuredFixedOpinion record);

    List<InjuredFixedOpinion> selectByExample(InjuredFixedOpinionExample example);

    InjuredFixedOpinion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredFixedOpinion record, @Param("example") InjuredFixedOpinionExample example);

    int updateByExample(@Param("record") InjuredFixedOpinion record, @Param("example") InjuredFixedOpinionExample example);

    int updateByPrimaryKeySelective(InjuredFixedOpinion record);

    int updateByPrimaryKey(InjuredFixedOpinion record);
}