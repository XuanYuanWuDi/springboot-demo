package com.injured.project.system.user.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 改派用户
 * @author cli
 *
 */
public class ReformSchoolUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 用户ID */
    private Long userId;

    /** 部门ID */
    private Long deptId;

    /** 登录名称 */
    private String loginName;

    /** 用户名称 */
    private String userName;

    /** 手机号码 */
    private String phonenumber;

    /** 用户头像 */
    private String avatar;

    /** 密码 */
    private String password;

    /** 盐加密 */
    private String salt;

    /** 帐号状态（0正常 1停用） */
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 最后登陆IP */
    private String loginIp;

    /** 最后登陆时间 */
    private Date loginDate;
    
    /** 员工工号 */
    private String userNo;

    /** 机构id */
    private Long agencyId;
    
    /** 机构名称 */
    private String agencyCode;
    
    /** 机构名称 */
    private String agencyName;
    
    /** 身份证号 */
    private String identifyNumber;
    
    /**  是否是初始密码，1是，0不是*/
    private Integer isInitialPassword;
    
    /**  用户状态 （0未锁定 1锁定）*/
    private String userLock; 
    
    /**  是否排队，0排队，1未排队*/
    private Integer isMoveIn; 
	
	/**
	 * 机构金额范围
	 */
	private String priceScope;
	
	private int underLevel;
	
	private String underLevelStr;

	public String getPriceScope() {
		return priceScope;
	}

	public void setPriceScope(String priceScope) {
		this.priceScope = priceScope;
	}

	public int getUnderLevel() {
		return underLevel;
	}

	public void setUnderLevel(int underLevel) {
		this.underLevel = underLevel;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public Long getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(Long agencyId) {
		this.agencyId = agencyId;
	}

	public String getAgencyCode() {
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public String getIdentifyNumber() {
		return identifyNumber;
	}

	public void setIdentifyNumber(String identifyNumber) {
		this.identifyNumber = identifyNumber;
	}

	public Integer getIsInitialPassword() {
		return isInitialPassword;
	}

	public void setIsInitialPassword(Integer isInitialPassword) {
		this.isInitialPassword = isInitialPassword;
	}

	public String getUserLock() {
		return userLock;
	}

	public void setUserLock(String userLock) {
		this.userLock = userLock;
	}

	public Integer getIsMoveIn() {
		return isMoveIn;
	}

	public void setIsMoveIn(Integer isMoveIn) {
		this.isMoveIn = isMoveIn;
	}

	public String getUnderLevelStr() {
		return underLevelStr;
	}

	public void setUnderLevelStr(String underLevelStr) {
		this.underLevelStr = underLevelStr;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
}
