package com.injured.project.system.agencyLevel.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.injured.project.system.agencyLevel.domain.CompanyAgencyUnder;
import com.injured.project.system.agencyLevel.domain.CompanyAgencyUnderExample;

public interface CompanyAgencyUnderMapper {
    long countByExample(CompanyAgencyUnderExample example);

    int deleteByExample(CompanyAgencyUnderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompanyAgencyUnder record);

    int insertSelective(CompanyAgencyUnder record);

    List<CompanyAgencyUnder> selectByExample(CompanyAgencyUnderExample example);

    CompanyAgencyUnder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CompanyAgencyUnder record, @Param("example") CompanyAgencyUnderExample example);

    int updateByExample(@Param("record") CompanyAgencyUnder record, @Param("example") CompanyAgencyUnderExample example);

    int updateByPrimaryKeySelective(CompanyAgencyUnder record);

    int updateByPrimaryKey(CompanyAgencyUnder record);
    
    /**
     * 根据机构id和菜单id 查询机构审核等级
     * @param id 机构id
     * @param menuId
     * @return
     */
    public Integer selectAgencyLevel(@Param("id") Long id, @Param("menuIds") List<Long> menuIds);
    
    /**
     * 根据机构id和菜单id 修改 机构审核等级
     * @param underList
     */
    public int updateAgencyLevel(CompanyAgencyUnder under);
    
    /**
     * 根据菜单id和保险公司id 查询机构等级信息
     * @param menuId
     * @param companyId
     * @return
     */
    public List<CompanyAgencyUnder> selectAgencyLevelByCompany( @Param("companyId") Long companyId);
}