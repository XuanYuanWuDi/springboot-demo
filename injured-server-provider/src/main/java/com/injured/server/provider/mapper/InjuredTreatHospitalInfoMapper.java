package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredTreatHospitalInfo;
import com.injured.server.api.entity.InjuredTreatHospitalInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredTreatHospitalInfoMapper {
    long countByExample(InjuredTreatHospitalInfoExample example);

    int deleteByExample(InjuredTreatHospitalInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredTreatHospitalInfo record);

    int insertSelective(InjuredTreatHospitalInfo record);

    List<InjuredTreatHospitalInfo> selectByExample(InjuredTreatHospitalInfoExample example);

    InjuredTreatHospitalInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredTreatHospitalInfo record, @Param("example") InjuredTreatHospitalInfoExample example);

    int updateByExample(@Param("record") InjuredTreatHospitalInfo record, @Param("example") InjuredTreatHospitalInfoExample example);

    int updateByPrimaryKeySelective(InjuredTreatHospitalInfo record);

    int updateByPrimaryKey(InjuredTreatHospitalInfo record);
}