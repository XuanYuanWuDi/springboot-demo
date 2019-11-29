package com.injured.server.api.model.compensat;

import com.injured.server.api.entity.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author zlu
 * @title: FastCompensationReviewDetail
 * @projectName injured
 * @description: 快赔审核详情
 * @date 2019/7/2911:28
 */
@Getter
@Setter
@ToString
public class FastCompensationReviewDetail implements Serializable {

    //基本信息
    private InjuredFastCompensatInfo fastCompensatInfo;

    //伤情诊断
    private List<InjuredTreatDiagnosisInfo> injuredTreatDiagnosisInfo;

    //损失项目
    private List<InjuredFixedLossList> injuredFixedLossList;

    //照片信息
    private List<InjuredImg> imgs;

    //审核意见
    private InjuredFastCompensatReviewOpinion reviewOpinion;

    //日志信息
    private List<InjuredStaffOperatLog> logs;

}
