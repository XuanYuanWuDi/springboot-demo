package com.injured.server.api.model.compensat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author cm
 * @title: Compensatlist
 * @projectName injured
 * @description: TODO
 * @date 2019/7/24
 */
@Setter
@Getter
@ToString
public class Compensatlist implements Serializable {
  //主键
  private Long id;
  //报案编号
  private  String claimnotificationNo;
  //被保险人
  private String theinsuredName;
  //报案时间
  private String reportDate;
  //伤者姓名
  private String humanName;
  //伤者属性
  private int humanType;
  //理赔机构
  private String claimsagency;
  //定损人姓名
  private String damageName;
  //定损金额
  private BigDecimal fixedlossAmount;
  //任务状态
  private int taskStatus;
  //审核接受时间
  private String reviewerTime;
  //等待时间
  private String waitTime;


}
