package com.injured.dubbo.controllers;

import com.alibaba.dubbo.config.annotation.Reference;
import com.injured.common.utils.StringUtils;
import com.injured.framework.web.controller.BaseController;
import com.injured.project.system.role.domain.SysUserAgnecyPrice;
import com.injured.project.system.role.mapper.SysUserAgnecyPriceMapper;
import com.injured.project.system.user.domain.User;
import com.injured.server.api.contract.CompanyAgencyContract;
import com.injured.server.api.contract.WorkbenchContract;
import com.injured.server.api.model.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author cm
 * @title: WorkbenchController
 * @projectName injured-web-manager
 * @description: 工作台
 * @date 2019/7/23
 */

@Controller
@RequestMapping("/workbench")
public class WorkbenchController extends BaseController {
    @Reference(timeout = 60000)
    private WorkbenchContract workbenchContract;

    @Reference(timeout = 60000)
    private CompanyAgencyContract companyAgencyContract;

    @Autowired
    private SysUserAgnecyPriceMapper sysUserAgnecyPriceMapper;

    private String prefix="workbench";

    @GetMapping()
    public String workbench(){
        return prefix;
    }
    /*
    查询我的工作台页面的数据信息
     */
    @GetMapping("/list")
    @ResponseBody
    public BaseResponse list(){
        User user = getSysUser();
        return workbenchContract.list(user.getUserId(),user.getUserNo());
    }


    /**
     *
     * ">1000,>1000&<=3000,>1000,>1000&<=5000"
     * 金额解析
     */
    public List<BigDecimal> priceAnalysis(String priceScope) {
        List<BigDecimal> result = new ArrayList<>();
        try {
            if(priceScope.contains("&")) {
                String[] ranges = priceScope.split("&");
                String greater = ranges[0].replaceAll(">=", "");
                if(greater.contains(">")){
                    greater =  ranges[0].replaceAll(">", "");
                }
                String less = ranges[1].replaceAll("<=", "");
                if(less.contains("<")){
                    less =  ranges[1].replaceAll("<", "");
                }
                result.add(new BigDecimal(greater));
                result.add(new BigDecimal(less));
            }else {
                if(priceScope.contains(">=")) {
                    String greater = priceScope.replaceAll(">=", "");
                    result.add(new BigDecimal(greater));

                }else if(priceScope.contains("<=")) {
                    String less = priceScope.replaceAll("<=", "");
                    result.add(new BigDecimal(less));
                }else if(priceScope.contains(">")){
                    String greater = priceScope.replaceAll(">", "");
                    result.add(new BigDecimal(greater));
                }else if(priceScope.contains("<")) {
                    String less = priceScope.replaceAll("<", "");
                    result.add(new BigDecimal(less));
                }
            }
        }catch (Exception e) {

        }
        return result;
    }
}
