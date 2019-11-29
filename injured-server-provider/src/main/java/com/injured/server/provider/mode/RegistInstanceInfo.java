package com.injured.server.provider.mode;

import java.util.Date;

public class RegistInstanceInfo {
	
	/**
	 * 被保险人
	 */
	private String insuredName;
	
	/**
	 * 车牌号
	 */
	private String licensePlateNo;
	
	/**
	 * 出险时间
	 */
	private Date dangerTime;

	
	/**
	 * 案件ID
	 */
	private Long registId;
	
	/**
	 * 商业险ID
	 */
	private Long InsuranceId;
	
	/**
	 *  险种：1 交强险；2 商业险
	 */
	private String insuranceCategory;

	public Long getRegistId() {
		return registId;
	}

	public void setRegistId(Long registId) {
		this.registId = registId;
	}

	public Long getInsuranceId() {
		return InsuranceId;
	}

	public void setInsuranceId(Long insuranceId) {
		InsuranceId = insuranceId;
	}

	public String getInsuranceCategory() {
		return insuranceCategory;
	}

	public void setInsuranceCategory(String insuranceCategory) {
		this.insuranceCategory = insuranceCategory;
	}

	public String getInsuredName() {
		return insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	public String getLicensePlateNo() {
		return licensePlateNo;
	}

	public void setLicensePlateNo(String licensePlateNo) {
		this.licensePlateNo = licensePlateNo;
	}

	public Date getDangerTime() {
		return dangerTime;
	}

	public void setDangerTime(Date dangerTime) {
		this.dangerTime = dangerTime;
	}
	
}
