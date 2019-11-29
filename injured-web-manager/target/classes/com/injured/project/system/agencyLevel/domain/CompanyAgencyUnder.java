package com.injured.project.system.agencyLevel.domain;

public class CompanyAgencyUnder {
    private Long id;

    private Long agencyId;

    private Long menuId;

    private Byte underLevel;
    
    private Long  companyId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Byte getUnderLevel() {
        return underLevel;
    }

    public void setUnderLevel(Byte underLevel) {
        this.underLevel = underLevel;
    }

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
}