package com.injured.server.api.contract;

import com.injured.server.api.model.response.BaseResponse;

import java.math.BigDecimal;

/**
 * @author zlu
 * @title: AviatorFormulaContract
 * @projectName injured
 * @description: 试运算
 * @date 2019/7/309:19
 */
public interface AviatorFormulaContract {

    public BaseResponse formula(Long infoId,String cityCode, String damageSiteCodes,
                                Integer sendDoctorType, Integer incomeStatus, BigDecimal medicalExpensesFee);
}
