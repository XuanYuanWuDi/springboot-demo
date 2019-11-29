package com.injured.server.provider.mapper;

import com.injured.server.api.entity.InjuredFormulaLog;
import com.injured.server.api.entity.InjuredFormulaLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InjuredFormulaLogMapper {
    long countByExample(InjuredFormulaLogExample example);

    int deleteByExample(InjuredFormulaLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InjuredFormulaLog record);

    int insertSelective(InjuredFormulaLog record);

    List<InjuredFormulaLog> selectByExample(InjuredFormulaLogExample example);

    InjuredFormulaLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InjuredFormulaLog record, @Param("example") InjuredFormulaLogExample example);

    int updateByExample(@Param("record") InjuredFormulaLog record, @Param("example") InjuredFormulaLogExample example);

    int updateByPrimaryKeySelective(InjuredFormulaLog record);

    int updateByPrimaryKey(InjuredFormulaLog record);
}