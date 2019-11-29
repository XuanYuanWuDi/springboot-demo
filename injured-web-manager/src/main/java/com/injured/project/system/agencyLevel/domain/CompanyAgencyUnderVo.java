package com.injured.project.system.agencyLevel.domain;

import java.util.List;

public class CompanyAgencyUnderVo {
    private String remark;

    private List<CompanyAgencyUnder> underList;
    
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<CompanyAgencyUnder> getUnderList() {
		return underList;
	}

	public void setUnderList(List<CompanyAgencyUnder> underList) {
		this.underList = underList;
	}

}