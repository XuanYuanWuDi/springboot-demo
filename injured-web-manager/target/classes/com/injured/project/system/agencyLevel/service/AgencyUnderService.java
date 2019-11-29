package com.injured.project.system.agencyLevel.service;


import java.util.List;

import com.injured.project.system.agencyLevel.domain.CompanyAgencyUnder;
import com.injured.project.system.agencyLevel.domain.CompanyAgencyUnderVo;

/**
 * 用户 业务层
 * 
 * @author lzx
 */
public interface AgencyUnderService
{
	/**
	 * 根据机构id，菜单id查询 审核级别(包括所有级别的机构)
	 * @return
	 */
	public Integer selectAllocatedList(Long companyId,Long agencyId, List<Long> menuIds);
	
	/**
	 * 根据机构id，菜单id  修改 审核级别
	 */
	public int updateAgencyLevel(CompanyAgencyUnderVo  underVo);
	
	/**
	 *根据菜单id和保险公司id 查询机构等级信息
	 * @param companyId
	 * @return
	 */
	public List<CompanyAgencyUnder> selectAgencyLevelByCompany(Long companyId);
	
	/**
	 * 根据机构id，菜单id查询 审核级别（只查询二级机构）
	 * @param id
	 * @param menuId
	 * @return
	 */
	public Integer selectAgencyLevel(Long id,List<Long> menuIds);
}
