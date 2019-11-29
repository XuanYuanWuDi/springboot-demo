package com.injured.framework.web.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.injured.framework.web.controller.BaseController;
import com.injured.project.system.user.domain.User;
import com.injured.server.api.contract.CompanyAgencyContract;
import com.injured.server.api.entity.CompanyAgency;
import com.injured.server.api.model.request.fast.CompanyAgencyReq;
import com.injured.server.api.model.response.BaseResponse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zlu
 * @title: CompanyAgencyService
 * @projectName injured
 * @description: 机构
 * @date 2019/8/210:13
 */
@Service("ce_agency")
public class CompanyAgencyService extends BaseController {

    @Reference
    private CompanyAgencyContract companyAgencyContract;

    /**
    　　* @description: 根据等级查询机构信息
    　　* @param [level]
    　　* @return java.util.List<com.injured.server.api.model.request.fast.CompanyAgencyReq>
    　　* @throws
    　　* @author LZX
    　　* @date 2019/8/2 10:20 
    　　*/
    public List<CompanyAgencyReq> findAgencyByLevel(Integer level){
        User user = getSysUser();
        Long companyId = user.getCompanyId();
        BaseResponse response= companyAgencyContract.findAgencyByLevel(level,companyId);
        return (List<CompanyAgencyReq>) response.getData();
    }


}
