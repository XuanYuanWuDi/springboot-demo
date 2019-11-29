package com.injured.server.api.contract;

import com.injured.server.api.model.response.BaseResponse;

/**
 * @author zlu
 * @title: InsurancePolicyContract
 * @projectName injured
 * @description: 保单信息
 * @date 2019/7/3115:39
 */
public interface InsurancePolicyContract {

    public BaseResponse detail(Long fastInfoId);
}
