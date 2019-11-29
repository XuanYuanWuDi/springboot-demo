package com.injured.server.provider.mapper;

import com.injured.server.api.entity.CeDictionariesType;
import com.injured.server.api.entity.CeDictionariesTypeExample;
import com.injured.server.provider.db.annotation.DataSource;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CeDictionariesTypeMapper {
	
	 @DataSource("slave")
    long countByExample(CeDictionariesTypeExample example);

	 @DataSource("slave")
    int deleteByExample(CeDictionariesTypeExample example);

	 @DataSource("slave")
    int deleteByPrimaryKey(Long id);

	 @DataSource("slave")
    int insert(CeDictionariesType record);

	 @DataSource("slave")
    int insertSelective(CeDictionariesType record);

	 @DataSource("slave")
    List<CeDictionariesType> selectByExample(CeDictionariesTypeExample example);

	 @DataSource("slave")
    CeDictionariesType selectByPrimaryKey(Long id);

	 @DataSource("slave")
    int updateByExampleSelective(@Param("record") CeDictionariesType record, @Param("example") CeDictionariesTypeExample example);

	 @DataSource("slave")
    int updateByExample(@Param("record") CeDictionariesType record, @Param("example") CeDictionariesTypeExample example);

	 @DataSource("slave")
    int updateByPrimaryKeySelective(CeDictionariesType record);

	 @DataSource("slave")
    int updateByPrimaryKey(CeDictionariesType record);
	 
	 @DataSource("slave")
	List<CeDictionariesType> selectAll();
}