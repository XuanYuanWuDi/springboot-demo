package com.injured.project.system.user.domain;

import java.util.List;

/**
 * 
 * @author cli
 *
 */
public class CompanyAgencyId {

	/**
	 * 公司id
	 */
	private Long companyId;
	
	/**
	 * 机构id
	 */
	private Long agencyId;
	
	/**
	 * 菜单id
	 */
	private List<Long> menuIds;
	
	/**
	 * 审核机制
	 */
	private Integer underLevel;

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(Long agencyId) {
		this.agencyId = agencyId;
	}

	public List<Long> getMenuIds() {
		return menuIds;
	}

	public void setMenuIds(List<Long> menuIds) {
		this.menuIds = menuIds;
	}

	public Integer getUnderLevel() {
		return underLevel;
	}

	public void setUnderLevel(Integer underLevel) {
		this.underLevel = underLevel;
	}
}
