package com.injured.server.api.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
@Getter
@Setter
@ToString
public class InjuredNotifyTask implements Serializable {
    private Long id;

    /**
     * 报案ID
     */
    private Long registId;

    /**
     * 业务ID
     */
    private Long businessId;

    /**
     * 业务类型 1快赔
     */
    private String bizType;

    /**
     * 最后回调时间
     */
    private Date notifyLastTime;

    /**
     * 0 未处理 1 已处理 2 初始化
     */
    private Integer state;

    /**
     * 回调次数
     */
    private Integer notifyNumber;

    /**
     * 回调参数
     */
    private String notifyParam;

    /**
     * 回调URL
     */
    private String notifyUrl;

    /**
     * 回调返回结果
     */
    private String notifyResult;

    /**
     * 回调返回状态
     */
    private String notifyStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 发送给保险公司的报文的格式，例如：xml、json、文本
     */
    private String notifyParamType;

    /**
     * 回调参数(除了JSON以外的数据格式)
     */
    private String notifyOtherParam;


    private Date notifyLastTimeBegin;

    private Date notifyLastTimeEnd;

    private static final long serialVersionUID = 1L;
}