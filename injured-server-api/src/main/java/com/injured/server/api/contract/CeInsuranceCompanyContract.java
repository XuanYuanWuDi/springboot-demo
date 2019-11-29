package com.injured.server.api.contract;

import com.injured.server.api.entity.CeInsuranceCompany;

/**
 * @author zlu
 * @title: CeInsuranceCompanyContract
 * @projectName injured
 * @description: TODO
 * @date 2019/7/269:49
 */
public interface CeInsuranceCompanyContract {

    public CeInsuranceCompany getCompanyById(Integer companyId);
}
