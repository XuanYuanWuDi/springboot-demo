package com.injured.project.system.user.domain;

import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;

import com.injured.framework.aspectj.lang.annotation.Excel;
import com.injured.framework.web.domain.BaseEntity;
import com.injured.server.api.model.request.fast.CompanyAgencyReq;

/**
 * 用户对象 sys_user
 * 
 * @author lzx
 */
public class UserVo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户ID */
    private Long userId;

    /** 角色ID */
    private Long roleId;

    /** 登录名称 */
    private String loginName;

    /** 用户名称 */
    @Excel(name = "用户姓名")
    private String userName;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String phonenumber;

    /** 密码 */
    private String password;

    /** 盐加密 */
    private String salt;

    /**  用户状态 0有效 1无效 */
    private String status;
    
    /**  用户状态 0无效 1有效 */
    @Excel(name = "用户状态")
    private String statusString;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 最后登陆IP */
    private String loginIp;

    /** 最后登陆时间 */
    private Date loginDate;
    

    private String powers;

    /** 保险公司id */
    private Long companyId;
    
    /** 员工工号 */
    @Excel(name = "用户工号")
    private String userNo;

    /** 机构id */
    private Long agencyId;
    
    /** 机构名称 */
    @Excel(name = "所属机构代码")
    private String agencyCode;
    
    /** 机构名称 */
    @Excel(name = "所属机构名称")
    private String agencyName;
    
    /** 身份证号 */
    @Excel(name = "身份证号")
    private String identifyNumber;
    
    /**  名称是否模糊查询 0-否 1-是 */
    private String fuzzy;
    
    /** 页面状态 （点击菜单进入列表页，不显示任何内容） */
    private int pageStatus;
    
    /** 一级机构  */
    private Long oneAgency;
    
    /**  二级机构 */
    private Long twoAgency;
    
    /**  三级机构 */
    private Long threeAgency;
    
    /**  四级机构 */
    private Long fourAgency;
    
    /**  用户类型 0-内部用户  1-外部用户 */
    private int userType;
    
    /**  用户类型 0-内部用户  1-外部用户 */
    @Excel(name = "用户类型")
    private String userTypeString;
    
    /**  机构列表 */
    private List<Long> agencyList;
    
    
    /**  用户状态 （0未锁定 1锁定） */
    private String userLock;
    
    /**  用户状态 （0未锁定 1锁定） */
    @Excel(name = "是否锁定")
    private String userLockString;
    
    /**  机构 */
    private CompanyAgencyReq companyAgency;
    
    /**  是否是初始密码，1是，0不是*/
    private Integer isInitialPassword;
    
    /**  快赔审核菜单权限-机构编码 */
    @Excel(name = "快赔审核机构编码")
    private String compensatAgencyCodes;
    
    /**  快赔审核菜单权限-机构金额范围 */
    @Excel(name = "快赔审核金额")
    private String compensatAgencyMoney;
    
    /** 审核级别 1-一级  2-二级 */
    @Excel(name = "快赔审核审核级别")
    private Integer underLevel;
    
    
    public Long getUserId()
    {
        return userId;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public boolean isAdmin()
    {
        return isAdmin(this.userId);
    }

    public static boolean isAdmin(Long userId)
    {
        return userId != null && 1L == userId;
    }

    public Long getRoleId()
    {
        return roleId;
    }

    public void setRoleId(Long roleId)
    {
        this.roleId = roleId;
    }

    public String getLoginName()
    {
        return loginName;
    }

    public void setLoginName(String loginName)
    {
        this.loginName = loginName;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPhonenumber()
    {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber)
    {
        this.phonenumber = phonenumber;
    }
    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getSalt()
    {
        return salt;
    }

    public void setSalt(String salt)
    {
        this.salt = salt;
    }

    /**
     * 生成随机盐
     */
    public void randomSalt()
    {
        // 一个Byte占两个字节，此处生成的3字节，字符串长度为6
        SecureRandomNumberGenerator secureRandom = new SecureRandomNumberGenerator();
        String hex = secureRandom.nextBytes(3).toHex();
        setSalt(hex);
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getDelFlag()
    {
        return delFlag;
    }

    public void setDelFlag(String delFlag)
    {
        this.delFlag = delFlag;
    }

    public String getLoginIp()
    {
        return loginIp;
    }

    public void setLoginIp(String loginIp)
    {
        this.loginIp = loginIp;
    }

    public Date getLoginDate()
    {
        return loginDate;
    }

    public void setLoginDate(Date loginDate)
    {
        this.loginDate = loginDate;
    }

    public String getPowers() {
        return powers;
    }

    public void setPowers(String powers) {
        this.powers = powers;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userId", getUserId())
            .append("loginName", getLoginName())
            .append("userName", getUserName())
            .append("phonenumber", getPhonenumber())
            .append("password", getPassword())
            .append("salt", getSalt())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("loginIp", getLoginIp())
            .append("loginDate", getLoginDate())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getIdentifyNumber() {
		return identifyNumber;
	}

	public void setIdentifyNumber(String identifyNumber) {
		this.identifyNumber = identifyNumber;
	}

	public String getFuzzy() {
		return fuzzy;
	}

	public void setFuzzy(String fuzzy) {
		this.fuzzy = fuzzy;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
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

	public int getPageStatus() {
		return pageStatus;
	}

	public void setPageStatus(int pageStatus) {
		this.pageStatus = pageStatus;
	}

	public Long getOneAgency() {
		return oneAgency;
	}

	public void setOneAgency(Long oneAgency) {
		this.oneAgency = oneAgency;
	}

	public Long getTwoAgency() {
		return twoAgency;
	}

	public void setTwoAgency(Long twoAgency) {
		this.twoAgency = twoAgency;
	}

	public Long getThreeAgency() {
		return threeAgency;
	}

	public void setThreeAgency(Long threeAgency) {
		this.threeAgency = threeAgency;
	}

	public Long getFourAgency() {
		return fourAgency;
	}

	public void setFourAgency(Long fourAgency) {
		this.fourAgency = fourAgency;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public List<Long> getAgencyList() {
		return agencyList;
	}

	public void setAgencyList(List<Long> agencyList) {
		this.agencyList = agencyList;
	}
	public CompanyAgencyReq getCompanyAgency() {
		return companyAgency;
	}

	public void setCompanyAgency(CompanyAgencyReq companyAgency) {
		this.companyAgency = companyAgency;
	}

	public Integer getIsInitialPassword() {
        return isInitialPassword;
    }

    public void setIsInitialPassword(Integer isInitialPassword) {
        this.isInitialPassword = isInitialPassword;
    }

	public String getCompensatAgencyCodes() {
		return compensatAgencyCodes;
	}

	public String getUserLock() {
		return userLock;
	}

	public void setUserLock(String userLock) {
		this.userLock = userLock;
	}

	public void setCompensatAgencyCodes(String compensatAgencyCodes) {
		this.compensatAgencyCodes = compensatAgencyCodes;
	}

	public String getCompensatAgencyMoney() {
		return compensatAgencyMoney;
	}

	public void setCompensatAgencyMoney(String compensatAgencyMoney) {
		this.compensatAgencyMoney = compensatAgencyMoney;
	}

	public Integer getUnderLevel() {
		return underLevel;
	}

	public void setUnderLevel(Integer underLevel) {
		this.underLevel = underLevel;
	}

	public String getStatusString() {
		return statusString;
	}

	public void setStatusString(String statusString) {
		this.statusString = statusString;
	}

	public String getUserLockString() {
		return userLockString;
	}

	public void setUserLockString(String userLockString) {
		this.userLockString = userLockString;
	}

	public String getUserTypeString() {
		return userTypeString;
	}

	public void setUserTypeString(String userTypeString) {
		this.userTypeString = userTypeString;
	}

}
