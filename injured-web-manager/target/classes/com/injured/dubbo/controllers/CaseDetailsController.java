package com.injured.dubbo.controllers;

import com.alibaba.dubbo.config.annotation.Reference;
import com.injured.server.api.contract.CaseDetailsContract;
import com.injured.server.api.enums.ResultEnum;
import com.injured.server.api.model.response.BaseResponse;
import com.injured.server.api.model.response.ResponseUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zlu
 * @title: CaseDetailsController
 * @projectName injured
 * @description: 案件详情接口
 * @date 2019/8/111:06
 */
@Controller
@RequestMapping("/casedetail")
public class CaseDetailsController {


    private String prefix="casedetail";

    @Reference
    private CaseDetailsContract caseDetailsContract;

    @GetMapping()
    public String view(){ return prefix+"/casedetail";}


    /**
     　　* @description: 快赔审核详情页面
     　　* @param [fastInfoId]
     　　* @return com.injured.server.api.model.response.BaseResponse
     　　* @throws
     　　* @author LZX
     　　* @date 2019/7/30 13:38
     　　*/
    @GetMapping("/detail")
    @ResponseBody
    public BaseResponse detail(@RequestParam("fastInfoId")Long fastInfoId){
        try {
            return caseDetailsContract.detail(fastInfoId);
        } catch (Exception e) {
            return ResponseUtil.error(ResultEnum.EXCEPTION);
        }
    }
}
