package com.injured.server.api.model.query;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * 报案查勘详情
 * @author cli
 *
 */
@Getter
@Setter
public class FastCompensatRegistRes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 报案号
	 */
	private String claimNotificationNo;
	
	/**
	 * 报案时间
	 */
	private Date notificationTime;
	
	/**
	 * 报案人姓名
	 */
	private String reporter;
	
	/**
	 * 报案人手机
	 */
	private String informantMobilTel;
	
	/**
	 * 出险时间
	 */
	private Date lossTime;

	/**
	 * 出险原因-查勘
	 */
	private String dangerCause;
	
	/**
	 * 事故类型-查勘
	 */
	private String ceAccidentType;
	
	/**
	 * 是否现场报案
	 */
	private String firstSceneInd;
	
	/**
	 * 驾驶员姓名-查勘驾驶员
	 */
	private String driverName;
	
	/**
	 * 驾驶员电话-查勘驾驶员
	 */
	private String driverPhone;
	
	/**
	 * 准驾车型-查勘驾驶员
	 */
	private String allowDrivingVehicle;
	
	/**
	 * 车牌号-查勘车
	 */
	private String licensePlateNo;
	
	/**
	 * 厂牌型号-查勘车
	 */
	private String brandModel;
	
	/**
	 * vin-查勘车
	 */
	private String vin;
	
	/**
	 * 车辆发动机号-查勘车
	 */
	private String engineNo;
	
	/**
	 * 车辆是否年检期内-查勘
	 */
	private String isCarAnnual;
	
	/**
	 * 是否已报交警-报案
	 */
	private String isPolice;
	
	/**
	 * 事故责任划分-查勘
	 */
	private String accidentLiability;
	
	/**
	 * 事故处理程序-查勘
	 */
	private String optionType;
	
	/**
	 * 驾驶员证件审核-查勘
	 */
	private String driverReview;
	
	/**
	 * 驾驶员行为-查勘驾驶员
	 */
	private String driverBehavior;
	
	/**
	 * 是否第一现场查勘
	 */
	private String isFirstScene;
	
	/**
	 * 受伤人数-报案
	 */
	private String hurtNum;
	
	/**
	 * 出险地点分类-报案
	 */
	private String damageAddressType;
	
	/**
	 * 出险地点-报案
	 */
	private String lossArea;
	
	/**
	 * 出险经过-报案
	 */
	private String lossDesc;


	//是否酒后驾车
	private String isDrinkingDriving;
}
