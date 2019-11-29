package com.injured.dubbo.controllers;

import com.alibaba.dubbo.config.annotation.Reference;
import com.injured.common.utils.StringUtils;
import com.injured.framework.web.controller.BaseController;
import com.injured.project.system.user.domain.ReformSchoolUser;
import com.injured.project.system.user.domain.User;
import com.injured.project.system.user.mapper.UserMapper;
import com.injured.project.system.user.service.IUserService;
import com.injured.server.api.contract.CompanyAgencyContract;
import com.injured.server.api.contract.CompensatContract;
import com.injured.server.api.contract.InjuredStaffOperatLogContract;
import com.injured.server.api.entity.InjuredFastCompensatInfo;
import com.injured.server.api.entity.InjuredStaffOperatLog;
import com.injured.server.api.enums.ResultEnum;
import com.injured.server.api.enums.TaskType;
import com.injured.server.api.model.compensat.FastCompensationReviewDetail;
import com.injured.server.api.model.response.BaseResponse;
import com.injured.server.api.model.response.ResponseUtil;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author zlu
 * @title: TaskController
 * @projectName injured
 * @description: 任务相关
 * @date 2019/8/513:13
 */
@Controller
@RequestMapping("/task")
public class TaskController extends BaseController {

    private String prefix="business/task";

    @Reference
    private CompensatContract compensatContract;

    @Reference
    private CompanyAgencyContract companyAgencyContract;

    @Reference
    private InjuredStaffOperatLogContract injuredStaffOperatLogContract;


    @Autowired
    private IUserService userService;



    /**
    　　* @description: 任务列表
    　　* @param []
    　　* @return java.lang.String
    　　* @throws
    　　* @author LZX
    　　* @date 2019/8/5 13:15
    　　*/
    @GetMapping("/tasklist")
    public String tasklist(){ return prefix+"/tasklist";}


    /**
    　　* @description: 任务改派
    　　* @param []
    　　* @return java.lang.String
    　　* @throws
    　　* @author LZX
    　　* @date 2019/8/5 13:15
    　　*/
    @GetMapping("/taskreform")
    public String taskReform(){ return prefix+"/taskreform";}




    @GetMapping("/reassignment")
    public String reassignment(String ids,ModelMap mmap){
        mmap.put("ids",ids);
        return prefix+"/reassignment";
    }


    @PostMapping("/reassignment/submit")
    @ResponseBody
    public BaseResponse reassSubmit(String fastInfoIdsStr,String userNo){

        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(ResultEnum.SUCCESS.getCode());

        List<String> fastInfoIds = Arrays.asList(StringUtils.split(fastInfoIdsStr, ","));

        StringBuilder builder = new StringBuilder();
        for (String fastInfoIdStr:fastInfoIds) {

            Long fastInfoId = Long.valueOf(fastInfoIdStr);

            if (fastInfoId == null || StringUtils.isBlank(userNo)) {
                return ResponseUtil.error(ResultEnum.PARAM_NULL);
            }

            InjuredFastCompensatInfo injuredFastCompensatInfo = compensatContract.selectById(fastInfoId);

            if(injuredFastCompensatInfo == null){
                builder.append("<font color ='red'>").append("案件ID为"+fastInfoId+"改派失败,未查询到案件信息</font></br>");
                continue;
            }

            User user = getSysUser();

            List<User> reassUser = userService.searchUserByNo(userNo,user.getCompanyId());
            if (reassUser == null || reassUser.size() != 1) {
                builder.append("伤者姓名为:").append(injuredFastCompensatInfo.getHumanName()).append("   改派结果为:")
                        .append("<font color ='red'>").append(ResultEnum.USER_IS_NOT_PERMISSION.getMsg()).append("</font>").append("</br>");
                continue;
            }

            user = reassUser.get(0);


            List<ReformSchoolUser> reformUsers = userService.getReformSchoolUsers(fastInfoId);

            boolean flag = false;

            ReformSchoolUser schoolUser = new ReformSchoolUser();

            for (ReformSchoolUser reformSchoolUser : reformUsers) {
                if (reformSchoolUser.getUserId().equals(user.getUserId())) {
                    flag = true;
                    schoolUser = reformSchoolUser;
                    break;
                }
            }
            if (!flag) {
                builder.append("伤者姓名为:").append(injuredFastCompensatInfo.getHumanName()).append("   改派结果为:")
                        .append("<font color ='red'>").append(ResultEnum.USER_IS_NOT_PERMISSION.getMsg()).append("</font>").append("</br>");
                continue;
            }
            //插入日志信息
            InjuredStaffOperatLog log = new InjuredStaffOperatLog();
            log.setCreateTime(new Date());
            log.setSubmitTask(TaskType.TASK_REASSIGNMENT.getCode());
            log.setSubmitNo(user.getUserNo());
            log.setSubmitOpinion("快赔审核人工改派");
            log.setSubmitName(user.getUserName());
            log.setSubmitTime(new Date());
            log.setCompanyId(user.getCompanyId());

            BaseResponse response = compensatContract.reassSubmit(fastInfoId, schoolUser.getUserId(), schoolUser.getUserName(), log, schoolUser.getUnderLevel());

            if(ResultEnum.SUCCESS.getCode().equals(response.getCode())) {
                builder.append("伤者姓名为:").append(injuredFastCompensatInfo.getHumanName()).append("   改派结果为:")
                        .append("<font color ='#00FF00'>").append(ResultEnum.SUCCESS.getMsg()).append("</font>").append("</br>");
            }else {
                builder.append("伤者姓名为:").append(injuredFastCompensatInfo.getHumanName()).append("   改派结果为:")
                        .append("<font color ='red'>").append(response .getMsg()).append("</font>").append("</br>");
            }
        }

        baseResponse.setData(builder.toString());
        return baseResponse;
    }


}
