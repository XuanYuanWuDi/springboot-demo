package com.injured.server.api.model.query;

import java.io.Serializable;

/**
 * 
 * 快赔任务审核数据集
 * @author cli
 *
 */
public class FastDispatchedWorkerUserNum implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 用户id
	 */
	private Long userId;
	
	/**
	 * 用户已审批数量
	 */
	private int num;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
