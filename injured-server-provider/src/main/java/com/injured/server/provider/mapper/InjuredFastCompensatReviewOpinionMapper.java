package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredFastCompensatReviewOpinion;
import com.injured.server.api.entity.InjuredFastCompensatReviewOpinionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredFastCompensatReviewOpinionMapper {
    long countByExample(InjuredFastCompensatReviewOpinionExample example);

    int deleteByExample(InjuredFastCompensatReviewOpinionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredFastCompensatReviewOpinion record);

    int insertSelective(InjuredFastCompensatReviewOpinion record);

    List<InjuredFastCompensatReviewOpinion> selectByExample(InjuredFastCompensatReviewOpinionExample example);

    InjuredFastCompensatReviewOpinion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredFastCompensatReviewOpinion record, @Param("example") InjuredFastCompensatReviewOpinionExample example);

    int updateByExample(@Param("record") InjuredFastCompensatReviewOpinion record, @Param("example") InjuredFastCompensatReviewOpinionExample example);

    int updateByPrimaryKeySelective(InjuredFastCompensatReviewOpinion record);

    int updateByPrimaryKey(InjuredFastCompensatReviewOpinion record);
}