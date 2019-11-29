package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredMedBasicInfo;
import com.injured.server.api.entity.InjuredMedBasicInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredMedBasicInfoMapper {
    long countByExample(InjuredMedBasicInfoExample example);

    int deleteByExample(InjuredMedBasicInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredMedBasicInfo record);

    int insertSelective(InjuredMedBasicInfo record);

    List<InjuredMedBasicInfo> selectByExample(InjuredMedBasicInfoExample example);

    InjuredMedBasicInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredMedBasicInfo record, @Param("example") InjuredMedBasicInfoExample example);

    int updateByExample(@Param("record") InjuredMedBasicInfo record, @Param("example") InjuredMedBasicInfoExample example);

    int updateByPrimaryKeySelective(InjuredMedBasicInfo record);

    int updateByPrimaryKey(InjuredMedBasicInfo record);
}