package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredCalculationFormula;
import com.injured.server.api.entity.InjuredCalculationFormulaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredCalculationFormulaMapper {
    long countByExample(InjuredCalculationFormulaExample example);

    int deleteByExample(InjuredCalculationFormulaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredCalculationFormula record);

    int insertSelective(InjuredCalculationFormula record);

    List<InjuredCalculationFormula> selectByExample(InjuredCalculationFormulaExample example);

    InjuredCalculationFormula selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredCalculationFormula record, @Param("example") InjuredCalculationFormulaExample example);

    int updateByExample(@Param("record") InjuredCalculationFormula record, @Param("example") InjuredCalculationFormulaExample example);

    int updateByPrimaryKeySelective(InjuredCalculationFormula record);

    int updateByPrimaryKey(InjuredCalculationFormula record);
}