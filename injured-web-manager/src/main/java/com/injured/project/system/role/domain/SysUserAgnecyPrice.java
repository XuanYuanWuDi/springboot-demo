package com.injured.project.system.role.domain;

/**
 * 用户菜单-机构-金额权限表
 * 
 * @author ly
 */
public class SysUserAgnecyPrice {
    private Long id;
    
    /** 用户id */
    private Long userId;

    /** 菜单id */
    private Long menuId;

    /** 机构id */
    private Long agencyId;

    /** 金额权限范围 */
    private String priceScope;
    
    /** 审核级别 1-一级  2-二级 */
    private Integer underLevel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
    }

    public String getPriceScope() {
        return priceScope;
    }

    public void setPriceScope(String priceScope) {
        this.priceScope = priceScope;
    }

	public Integer getUnderLevel() {
		return underLevel;
	}

	public void setUnderLevel(Integer underLevel) {
		this.underLevel = underLevel;
	}
}