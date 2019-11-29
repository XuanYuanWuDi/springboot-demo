package com.injured.project.system.user.domain;

/**
 * 获取可用快赔审核用户
 * @author cli
 *
 */
public class FastReviewedUser {

	/**
	 * id
	 */
	private Long userId;
	
	/**
	 * 名称
	 */
	private String userName;
	
	/**
	 * 机构金额范围
	 */
	private String priceScope;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPriceScope() {
		return priceScope;
	}

	public void setPriceScope(String priceScope) {
		this.priceScope = priceScope;
	}
	
}
