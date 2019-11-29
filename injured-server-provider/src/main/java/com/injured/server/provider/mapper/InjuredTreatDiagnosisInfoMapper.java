package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredTreatDiagnosisInfo;
import com.injured.server.api.entity.InjuredTreatDiagnosisInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredTreatDiagnosisInfoMapper {
    long countByExample(InjuredTreatDiagnosisInfoExample example);

    int deleteByExample(InjuredTreatDiagnosisInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredTreatDiagnosisInfo record);

    int insertSelective(InjuredTreatDiagnosisInfo record);

    List<InjuredTreatDiagnosisInfo> selectByExample(InjuredTreatDiagnosisInfoExample example);

    InjuredTreatDiagnosisInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredTreatDiagnosisInfo record, @Param("example") InjuredTreatDiagnosisInfoExample example);

    int updateByExample(@Param("record") InjuredTreatDiagnosisInfo record, @Param("example") InjuredTreatDiagnosisInfoExample example);

    int updateByPrimaryKeySelective(InjuredTreatDiagnosisInfo record);

    int updateByPrimaryKey(InjuredTreatDiagnosisInfo record);
    
    int insertBatch(List<InjuredTreatDiagnosisInfo> records);
}