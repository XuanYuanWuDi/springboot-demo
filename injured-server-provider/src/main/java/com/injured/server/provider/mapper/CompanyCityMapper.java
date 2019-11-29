package com.injured.server.provider.mapper;

import com.injured.server.api.entity.CompanyCity;
import com.injured.server.api.entity.CompanyCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyCityMapper {
    long countByExample(CompanyCityExample example);

    int deleteByExample(CompanyCityExample example);

    int deleteByPrimaryKey(String id);

    int insert(CompanyCity record);

    int insertSelective(CompanyCity record);

    List<CompanyCity> selectByExample(CompanyCityExample example);

    CompanyCity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CompanyCity record, @Param("example") CompanyCityExample example);

    int updateByExample(@Param("record") CompanyCity record, @Param("example") CompanyCityExample example);

    int updateByPrimaryKeySelective(CompanyCity record);

    int updateByPrimaryKey(CompanyCity record);
}