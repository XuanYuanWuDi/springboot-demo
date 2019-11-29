package com.injured.dubbo.controllers;

import com.alibaba.dubbo.config.annotation.Reference;
import com.injured.common.exception.BusinessException;
import com.injured.common.utils.StringUtils;
import com.injured.common.utils.security.ShiroUtils;
import com.injured.commons.PageBean;
import com.injured.framework.web.controller.BaseController;
import com.injured.framework.web.page.TableDataInfo;
import com.injured.project.system.user.domain.User;
import com.injured.server.api.contract.CaseDetailsContract;
import com.injured.server.api.contract.CompensatContract;
import com.injured.server.api.contract.InsurancePolicyContract;
import com.injured.server.api.entity.InjuredFastCompensatInfo;
import com.injured.server.api.enums.ResultEnum;
import com.injured.server.api.model.caseinformation.CaseInformationResponse;
import com.injured.server.api.model.compensat.FastCompensationReviewDetail;
import com.injured.server.api.model.compensat.FastCompensationReviewQuery;
import com.injured.server.api.model.insurance.InsuranceResponse;
import com.injured.server.api.model.response.BaseResponse;
import com.injured.server.api.model.response.ResponseUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/*
  快赔审核功能
 @author cm
 */
@Controller
@RequestMapping("/compensat")
public class CompensatController extends BaseController{

    private static Logger logger = LogManager.getLogger(CompensatController.class);

    @Reference(timeout = 60000)
    private CompensatContract compensatContract;

    @Reference(timeout = 60000)
    private CaseDetailsContract caseDetailsContract;

    @Reference(timeout = 60000)
    private InsurancePolicyContract insurancePolicyContract;

    private String prefix="business/compensat";

    @GetMapping()
    public String compensat(){ return prefix+"/list";}

    /**
    　　* @description: 快赔审核列表查询
    　　* @param [query]
    　　* @return com.injured.framework.web.page.TableDataInfo
    　　* @throws
    　　* @author LZX
    　　* @date 2019/7/30 13:37
    　　*/
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FastCompensationReviewQuery query, HttpServletRequest request){
        TableDataInfo rspData = new TableDataInfo();
        //初始化请求参数
        query = initQuery(query,request);

        if(query == null){
            return rspData;
        }
        BaseResponse response = compensatContract.selectlist(query);

        PageBean<InjuredFastCompensatInfo> pageBean = (PageBean<InjuredFastCompensatInfo>)response.getData();

        rspData.setCode(Integer.parseInt(response.getCode()));
        if(pageBean.getList() == null){
            rspData.setRows(new ArrayList<>());
        }else {
            rspData.setRows(pageBean.getList());
        }
        rspData.setTotal(pageBean.getTotal());
        return rspData;
    }


    /**
     　　* @description: 快赔审核详情页面
     　　* @param [fastInfoId]
     　　* @return com.injured.server.api.model.response.BaseResponse
     　　* @throws
     　　* @author LZX
     　　* @date 2019/7/30 13:38
     　　*/
    @GetMapping("/detail/{id}/{htmlName}")
    public String detail(@PathVariable("id") Long id,@PathVariable("htmlName") String htmlName, ModelMap mmap){
        User currentUser = ShiroUtils.getSysUser();
        long beginTime = System.currentTimeMillis();
        BaseResponse response = compensatContract.detail(id);
        long endTime = System.currentTimeMillis();
        logger.info("请求伤者信息耗时为{}毫秒",(endTime-beginTime));
        if(response.getCode().equals(ResultEnum.SUCCESS.getCode())){
            FastCompensationReviewDetail detail  = (FastCompensationReviewDetail) response.getData();
            mmap.put("detail",detail);
        }
        mmap.put("user",currentUser);
        mmap.put("htmlName",htmlName);
        return prefix+"/detail";
    }




    /**
     　　* @description: 快赔审核详情页面
     　　* @param [fastInfoId]
     　　* @return com.injured.server.api.model.response.BaseResponse
     　　* @throws
     　　* @author LZX
     　　* @date 2019/7/30 13:38
     　　*/
    @GetMapping("/caseDetail/{id}")
    public String caseDetail(@PathVariable("id") Long id, ModelMap mmap){
        User currentUser = ShiroUtils.getSysUser();
        BaseResponse response = new BaseResponse();

        long beginTime = System.currentTimeMillis();
        response = caseDetailsContract.detail(id);
        long endTime = System.currentTimeMillis();
        logger.info("请求案件信息耗时为{}毫秒",(endTime-beginTime));

        CaseInformationResponse caseInformationResponseresponse = (CaseInformationResponse) response.getData();

        beginTime = System.currentTimeMillis();
        response =insurancePolicyContract.detail(id);
        endTime = System.currentTimeMillis();
        logger.info("请求保单信息耗时为{}毫秒",(endTime-beginTime));
        if(ResultEnum.SUCCESS.getCode().equals(response.getCode())){
            mmap.put("insuranceDetail",response.getData());
        }else{
            mmap.put("insuranceDetail",new InsuranceResponse());
        }
        InsuranceResponse insuranceResponse = (InsuranceResponse) response.getData();
        if(insuranceResponse != null && caseInformationResponseresponse != null) {
            if (insuranceResponse.getCommercialInsuranceResponse() != null &&
                    StringUtils.isNotBlank(insuranceResponse.getCommercialInsuranceResponse().getPolicyNo())) {
                caseInformationResponseresponse.setShangYeIsExist("1");
            }

            if (insuranceResponse != null && insuranceResponse.getCompulsoryInsuranceResponse() != null &&
                    StringUtils.isNotBlank(insuranceResponse.getCompulsoryInsuranceResponse().getPolicyNo())) {
                caseInformationResponseresponse.setJiaoQiangIsExist("1");
            }
        }

        if(caseInformationResponseresponse != null){
            mmap.put("caseDetail",caseInformationResponseresponse);
        }else{
            mmap.put("caseDetail",new CaseInformationResponse());
        }
        mmap.put("user",currentUser);
        return prefix+"/caseDetail";
    }


    /**
     　　* @description: 快赔审核详情页面
     　　* @param [fastInfoId]
     　　* @return com.injured.server.api.model.response.BaseResponse
     　　* @throws
     　　* @author LZX
     　　* @date 2019/7/30 13:38
     　　*/
    @GetMapping("/insuranceDetail/{id}")
    public String insuranceDetail(@PathVariable("id") Long id, ModelMap mmap){
        User currentUser = ShiroUtils.getSysUser();
        BaseResponse response = new BaseResponse();

        long beginTime = System.currentTimeMillis();
        response =insurancePolicyContract.detail(id);
        long endTime = System.currentTimeMillis();
        logger.info("请求保单信息耗时为{}毫秒",(endTime-beginTime));
        if(ResultEnum.SUCCESS.getCode().equals(response.getCode())){
            mmap.put("insuranceDetail",response.getData());
        }else{
            mmap.put("insuranceDetail",new InsuranceResponse());
        }
        mmap.put("user",currentUser);
        return prefix+"/insuranceDetail";
    }


    /**
    　　* @description: 快赔审核修改接口
    　　* @param [detail]
    　　* @return com.injured.server.api.model.response.BaseResponse
    　　* @throws
    　　* @author LZX
    　　* @date 2019/7/30 14:03
    　　*/
    @PostMapping("/edit")
    @ResponseBody
    public BaseResponse edit(@RequestBody FastCompensationReviewDetail detail){
        try {
            User user = getSysUser();
            return compensatContract.edit(detail, 0,user.getUserId());
        }catch(BusinessException exception){
            BaseResponse response = new BaseResponse();
            response.setMsg(exception.getMessage());
            return response;
        }
    }


    /**
     　　* @description: 快赔审核提交接口
     　　* @param [detail]
     　　* @return com.injured.server.api.model.response.BaseResponse
     　　* @throws
     　　* @author LZX
     　　* @date 2019/7/30 14:03
     　　*/
    @PostMapping("/submit")
    @ResponseBody
    public BaseResponse submit(@RequestBody FastCompensationReviewDetail detail){
        User user = getSysUser();
        if(!"0".equals(user.getStatus())){
            return ResponseUtil.error(ResultEnum.USER_STATUS_IS_LOCK);
        }
        if(!"0".equals(user.getUserLock())){
            return ResponseUtil.error(ResultEnum.USER_STATUS_IS_LOCK);
        }
        return compensatContract.submit(detail,user.getUserId());
    }

}
