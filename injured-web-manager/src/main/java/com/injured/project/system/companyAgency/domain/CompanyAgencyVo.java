package com.injured.project.system.companyAgency.domain;

import java.io.Serializable;

import com.injured.framework.aspectj.lang.annotation.Excel;

/**
 * @author 
 */
public class CompanyAgencyVo implements Serializable {
    private Long id;

    /**
     * 父机构ID
     */
    private Long pid;

    /**
     * 机构名称
     */
    @Excel(name = "机构名称")
    private String agencyName;

    /**
     * 机构编码
     */
    @Excel(name = "机构代码")
    private String agencyCode;

    /**
     * 保险公司编码
     */
    private String companyCode;

    /**
     * 保险公司ID
     */
    private Long companyId;

    /**
     * 0否 1是
     */
    @Excel(name = "是否有子机构")
    private Integer havingChildNode;

    /**
     * 是否为理赔机构 0-否 1-是
     */
    @Excel(name = "是否理赔机构")
    private Integer isClaim;
    
    /**
     * 机构等级
     */
    @Excel(name = "机构层级")
    private Integer agencyLevel;
    
    /**
     * 备注说明
     */
    @Excel(name = "备注")
    private String remark;
    
    /**
     * 上级机构代码
     */
    @Excel(name = "上级机构代码")
    private String agencyCodeUp;


    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getAgencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Integer getHavingChildNode() {
        return havingChildNode;
    }

    public void setHavingChildNode(Integer havingChildNode) {
        this.havingChildNode = havingChildNode;
    }

    public Integer getIsClaim() {
        return isClaim;
    }

    public void setIsClaim(Integer isClaim) {
        this.isClaim = isClaim;
    }


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getAgencyLevel() {
		return agencyLevel;
	}

	public void setAgencyLevel(Integer agencyLevel) {
		this.agencyLevel = agencyLevel;
	}

	public String getAgencyCodeUp() {
		return agencyCodeUp;
	}

	public void setAgencyCodeUp(String agencyCodeUp) {
		this.agencyCodeUp = agencyCodeUp;
	}
}