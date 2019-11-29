package com.injured.server.api.model.query;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FastCompensatQueryRes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 快赔定损信息ID
	 */
	private Long id;
	
	/**
	 * 报案编号
	 */
	private String claimNotificationNo;
	
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
	private Date lossTime;
	
	/**
	 * 伤者姓名
	 */
	private String humanName;
	
	/**
	 * 伤者属性
	 */
	private String humanType;
	
	/**
	 * 案件ID
	 */
	private Long registId;
	
//	/**
//	 * 商业险ID
//	 */
//	private Long commercialInsuranceId;
//	
//	/**
//	 * 交强险ID
//	 */
//	private Long compulsoryInsuranceId;

}
