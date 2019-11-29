package com.injured.project.system.role.domain;

import java.util.List;

import com.injured.framework.web.domain.BaseEntity;

/**
 * 角色表 sys_role
 * 
 * @author lzx
 */
public class UserMenuVo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    private List<SysUserAgnecyPrice> priceList;
    
    private List<RoleMenu> menuList;
    
    private Long userId;
    
    private Long roleId;
    
    private String remark;
    
    private Long companyId;
    

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public List<SysUserAgnecyPrice> getPriceList() {
		return priceList;
	}

	public void setPriceList(List<SysUserAgnecyPrice> priceList) {
		this.priceList = priceList;
	}

	public List<RoleMenu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<RoleMenu> menuList) {
		this.menuList = menuList;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

}
