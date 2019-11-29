package com.injured.server.api.model.query;

import java.io.Serializable;

/**
 * 派工信息
 * @author cli
 *
 */
public class DispatchedWorkerInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 快赔信息ID
	 */
	private Long infoId;

	/**
	 * 派工给的用户
	 */
	private Long userId;
	
	/**
	 * 派工后的状态
	 */
	private int status;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Long getInfoId() {
		return infoId;
	}

	public void setInfoId(Long infoId) {
		this.infoId = infoId;
	}
}
