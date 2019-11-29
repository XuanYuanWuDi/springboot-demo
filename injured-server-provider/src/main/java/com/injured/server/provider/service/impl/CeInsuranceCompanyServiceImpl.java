package com.injured.server.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.injured.server.api.contract.CeInsuranceCompanyContract;
import com.injured.server.api.entity.CeInsuranceCompany;
import com.injured.server.api.entity.CeInsuranceCompanyExample;
import com.injured.server.api.enums.ResultEnum;
import com.injured.server.api.model.response.ResponseUtil;
import com.injured.server.provider.mapper.CeInsuranceCompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.PrintWriter;
import java.util.List;

/**
 * @author zlu
 * @title: CeInsuranceCompanyServiceImpl
 * @projectName injured
 * @description: TODO
 * @date 2019/7/269:49
 */
@Service
public class CeInsuranceCompanyServiceImpl implements CeInsuranceCompanyContract {

    @Autowired
    private CeInsuranceCompanyMapper ceInsuranceCompanyMapper;

    @Override
    public CeInsuranceCompany getCompanyById(Integer companyId) {
        CeInsuranceCompanyExample example = new CeInsuranceCompanyExample();
        example.createCriteria().andIdEqualTo(Integer.valueOf(companyId));
        List<CeInsuranceCompany> ceInsuranceCompanys = ceInsuranceCompanyMapper.selectByExample(example);

        if(ceInsuranceCompanys == null || ceInsuranceCompanys.size() != 1){
           return null;
        }
        return ceInsuranceCompanys.get(0);
    }
}
