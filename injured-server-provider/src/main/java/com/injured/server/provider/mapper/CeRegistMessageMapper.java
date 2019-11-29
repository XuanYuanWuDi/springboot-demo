package com.injured.server.provider.mapper;

import com.injured.server.api.entity.CeRegistMessage;
import com.injured.server.api.entity.CeRegistMessageExample;
import java.util.List;

import com.injured.server.provider.db.annotation.DataSource;
import org.apache.ibatis.annotations.Param;

public interface CeRegistMessageMapper {
    @DataSource("slave")
    long countByExample(CeRegistMessageExample example);
    @DataSource("slave")
    int deleteByExample(CeRegistMessageExample example);
    @DataSource("slave")
    int deleteByPrimaryKey(Long id);
    @DataSource("slave")
    int insert(CeRegistMessage record);
    @DataSource("slave")
    int insertSelective(CeRegistMessage record);
    @DataSource("slave")
    List<CeRegistMessage> selectByExampleWithBLOBs(CeRegistMessageExample example);
    @DataSource("slave")
    List<CeRegistMessage> selectByExample(CeRegistMessageExample example);
    @DataSource("slave")
    CeRegistMessage selectByPrimaryKey(Long id);
    @DataSource("slave")
    int updateByExampleSelective(@Param("record") CeRegistMessage record, @Param("example") CeRegistMessageExample example);
    @DataSource("slave")
    int updateByExampleWithBLOBs(@Param("record") CeRegistMessage record, @Param("example") CeRegistMessageExample example);
    @DataSource("slave")
    int updateByExample(@Param("record") CeRegistMessage record, @Param("example") CeRegistMessageExample example);
    @DataSource("slave")
    int updateByPrimaryKeySelective(CeRegistMessage record);
    @DataSource("slave")
    int updateByPrimaryKeyWithBLOBs(CeRegistMessage record);
    @DataSource("slave")
    int updateByPrimaryKey(CeRegistMessage record);
}