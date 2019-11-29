package com.injured.server.api.contract;

import com.injured.server.api.entity.InjuredFastCompensatInfo;
import com.injured.server.api.model.response.BaseResponse;

/**
 * @author zlu
 * @title: CaseDetailsContract
 * @projectName injured
 * @description: 案件详情
 * @date 2019/8/111:08
 */
public interface CaseDetailsContract {
    BaseResponse detail(Long fastInfoId);
    
    InjuredFastCompensatInfo getInjuredFastCompensatInfoDetial(Long fastInfoId);
}
