package com.injured.server.api.model.compensat;

import com.injured.server.api.model.request.BaseRequest;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author zlu
 * @title: FastCompensationReviewQuery
 * @projectName injured
 * @description: 快赔审核列表查询请求类
 * @date 2019/7/2910:26
 */
@Getter
@Setter
@ToString
public class FastCompensationReviewQuery extends BaseRequest implements Serializable {

    //机构ID
    private Long companyAgencyId;

    //机构一级ID
    private Long companyAgencyIdFirst;

    //报案号
    private String claimNotificationNo;

    //任务状态
    private Integer reviewStatus;

    //人伤类型
    private Integer humanInjury;

    //定损金额BEGIN
    private BigDecimal fixedLossAmountBegin;

    //定损金额END
    private BigDecimal fixedLossAmountEnd;

    //出险时间BEGIN
    private Date lossTimeBegin;

    //出险时间END
    private Date lossTimeEnd;

    //审核人ID
    private Long reviewerId;

    //排序字段
    private String orderByColumn;

    //每个菜单的审核状态限制
    private String reviewStatusInit;

    //被保险人
    private String theInsuredName;

    //任务类型一级
    private String taskTypeFirst;

    //任务类型二级
    private String taskTypeSecond;

    //是否只能自己查看
    private Boolean isYourSelf = true;
}
