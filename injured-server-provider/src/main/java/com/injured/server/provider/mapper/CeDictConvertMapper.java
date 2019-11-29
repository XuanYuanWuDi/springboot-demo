package com.injured.server.provider.mapper;
import com.injured.server.api.entity.CeDictConvert;
import com.injured.server.api.entity.CeDictConvertExample;
import java.util.List;

import com.injured.server.provider.db.annotation.DataSource;
import org.apache.ibatis.annotations.Param;

public interface CeDictConvertMapper{
    @DataSource("slave")
    long countByExample(CeDictConvertExample example);
    @DataSource("slave")
    int deleteByExample(CeDictConvertExample example);
    @DataSource("slave")
    int deleteByPrimaryKey(Integer id);
    @DataSource("slave")
    int insert(CeDictConvert record);
    @DataSource("slave")
    int insertSelective(CeDictConvert record);
    @DataSource("slave")
    List<CeDictConvert> selectByExample(CeDictConvertExample example);
    @DataSource("slave")
    CeDictConvert selectByPrimaryKey(Integer id);
    @DataSource("slave")
    int updateByExampleSelective(@Param("record") CeDictConvert record, @Param("example") CeDictConvertExample example);
    @DataSource("slave")
    int updateByExample(@Param("record") CeDictConvert record, @Param("example") CeDictConvertExample example);
    @DataSource("slave")
    int updateByPrimaryKeySelective(CeDictConvert record);
    @DataSource("slave")
    int updateByPrimaryKey(CeDictConvert record);
}