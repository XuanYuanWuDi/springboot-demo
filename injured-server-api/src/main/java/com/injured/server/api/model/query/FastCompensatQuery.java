package com.injured.server.api.model.query;

import java.util.Date;

import com.injured.server.api.annotations.NotNull;
import com.injured.server.api.model.request.BaseRequest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FastCompensatQuery extends BaseRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 定损人姓名
	 */
	private String damageName;
	
	/**
	 * 定损人工号
	 */
	@NotNull(groups = { "fastQuery" })
	private String damageNo;
	
	/**
	 * 任务状态
	 */
	@NotNull(groups = { "fastQuery" })
	private int taskStatus;
	
	/**
	 * 开始时间
	 */
	private Date startTime;
	
	/**
	 * 结束时间
	 */
	private Date endTime;

}
