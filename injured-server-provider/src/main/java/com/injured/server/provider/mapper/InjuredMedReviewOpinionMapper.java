package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredMedReviewOpinion;
import com.injured.server.api.entity.InjuredMedReviewOpinionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredMedReviewOpinionMapper {
    long countByExample(InjuredMedReviewOpinionExample example);

    int deleteByExample(InjuredMedReviewOpinionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredMedReviewOpinion record);

    int insertSelective(InjuredMedReviewOpinion record);

    List<InjuredMedReviewOpinion> selectByExample(InjuredMedReviewOpinionExample example);

    InjuredMedReviewOpinion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredMedReviewOpinion record, @Param("example") InjuredMedReviewOpinionExample example);

    int updateByExample(@Param("record") InjuredMedReviewOpinion record, @Param("example") InjuredMedReviewOpinionExample example);

    int updateByPrimaryKeySelective(InjuredMedReviewOpinion record);

    int updateByPrimaryKey(InjuredMedReviewOpinion record);
}