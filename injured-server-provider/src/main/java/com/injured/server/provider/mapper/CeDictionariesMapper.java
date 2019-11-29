package com.injured.server.provider.mapper;

import com.injured.server.api.entity.CeDictionaries;
import com.injured.server.provider.db.annotation.DataSource;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CeDictionariesMapper{
    @DataSource("slave")
    int deleteByPrimaryKey(Integer id);
    @DataSource("slave")
    int insert(CeDictionaries record);
    @DataSource("slave")
    int insertSelective(CeDictionaries record);
    @DataSource("slave")
    CeDictionaries selectByPrimaryKey(Integer id);
    @DataSource("slave")
    int updateByPrimaryKeySelective(CeDictionaries record);
    @DataSource("slave")
    int updateByPrimaryKey(CeDictionaries record);
    @DataSource("slave")
    List<CeDictionaries> selectDictByType(@Param("type")String type);
    @DataSource("slave")
    List<CeDictionaries> selectDictByParentId(@Param("parenId")Integer parenId);
    @DataSource("slave")
    List<CeDictionaries> selectAll();
    @DataSource("slave")
    List<CeDictionaries> selectAgencyByPCode(@Param("parentCode")String parentCode);
    @DataSource("slave")
    CeDictionaries getDictByTypeAndCode(@Param("type")String type,@Param("code")String code);
}