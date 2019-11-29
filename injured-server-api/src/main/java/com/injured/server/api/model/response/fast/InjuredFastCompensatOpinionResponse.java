package com.injured.server.api.model.response.fast;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zlu
 * @title: InjuredFastCompensatOpinionResponse
 * @projectName injured
 * @description: 审核信息返回数据
 * @date 2019/8/2810:28
 */
@Getter
@Setter
@ToString
public class InjuredFastCompensatOpinionResponse implements Serializable {

    /**
     * 审核人姓名
     */
    private String reviewerName;

    /**
     * 审核人工号
     */
    private String reviewerNo;

    /**
     * 审核接收时间
     */
    private String reviewerTime;

    /**
     * 审核提交时间
     */
    private String reviewerSubmitTime;

    /**
     * 查勘是否合格
     */
    private Byte isQualificatSurvey;

    /**
     * 审核意见
     */
    private String auditOpinion;

    /**
     * 审核说明
     */
    private String auditInstruc;
}
