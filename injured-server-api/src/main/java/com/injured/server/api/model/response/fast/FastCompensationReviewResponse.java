package com.injured.server.api.model.response.fast;

import com.injured.server.api.entity.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author zlu
 * @title: FastCompensationReviewResponse
 * @projectName injured
 * @description: 快赔任务返回数据
 * @date 2019/8/2810:23
 */
@Getter
@Setter
@ToString
public class FastCompensationReviewResponse implements Serializable {

    //保险公司任务号
    private String taskNo;

    /**
     * 报案编号
     */
    private String claimNotificationNo;

    /**
     * 业务类型
     */
    private String businessType;

    //基本信息
    private InjuredFastCompensatInfoResponse fastCompensatInfoResponse;

    //伤情诊断
    private List<InjuredTreatDiagnosisInfoResponse> injuredTreatDiagnosisInfoResponse;

    //损失项目
    private List<InjuredFixedLossListResponse> injuredFixedLossListResponse;

    //照片信息
    private List<InjuredImgResponse> imgsResponse;

    //审核意见
    private List<InjuredFastCompensatOpinionResponse> reviewOpinionResponse;

}
