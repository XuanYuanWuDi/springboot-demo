package com.injured.server.api.model.request.fast;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zlu
 * @title: Vehicle
 * @projectName injured
 * @description: 车辆信息
 * @date 2019/7/2213:56
 */
@Getter
@Setter
@ToString
public class CompanyAgencyReq implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;

    /**
     * 父机构ID
     */
    private Long pid;

    /**
     * 机构名称
     */
    private String agencyName;

    /**
     * 机构编码
     */
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
    private Integer havingChildNode;

    /**
     * 是否为理赔机构 0-否 1-是
     */
    private Integer isClaim;
    
    /**
     * 机构等级
     */
    private Integer agencyLevel;
    
    /**
     * 名称是否模糊查询 0-否 1-是
     */
    private String fuzzy;
    
    /**
     * 上级机构编码
     */
    private String agencyCodeUp;
    
    /**
     * 上级机构名称
     */
    private String agencyNameUp;
    
    /**
     * 备注说明
     */
    private String remark;
    
    /**
     * 状态
     */
    private int status;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompanyAgencyReq other = (CompanyAgencyReq) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
    
    

}
