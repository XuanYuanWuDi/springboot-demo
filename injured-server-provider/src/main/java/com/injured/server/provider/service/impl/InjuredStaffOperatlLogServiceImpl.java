package com.injured.server.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.injured.server.api.contract.InjuredStaffOperatLogContract;
import com.injured.server.api.entity.InjuredStaffOperatLog;
import com.injured.server.api.enums.ResultEnum;
import com.injured.server.api.model.response.BaseResponse;
import com.injured.server.api.model.response.ResponseUtil;
import com.injured.server.provider.mapper.InjuredStaffOperatLogMapper;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zlu
 * @title: CompanyAgencyServiceImpl
 * @projectName injured
 * @description: 保险公司机构
 * @date 2019/7/318:04
 */
@Service
public class InjuredStaffOperatlLogServiceImpl implements InjuredStaffOperatLogContract {

    private static Logger logger = LogManager.getLogger(InjuredStaffOperatlLogServiceImpl.class);

    @Autowired
    private InjuredStaffOperatLogMapper injuredStaffOperatLogMapper;

    @Override
    public BaseResponse logListByTaskId(int submitTask,Long id, Long companyId) {
    	try {
    		List<InjuredStaffOperatLog> injuredList = injuredStaffOperatLogMapper.logListByTaskId(submitTask, id, companyId);
    		return ResponseUtil.success(injuredList);
    	}catch(Exception e) {
    		logger.error("logListByTaskId查询日志信息失败", e);
    		return ResponseUtil.error(ResultEnum.EXCEPTION);
    	}
    }
	@Override
    public void addInjuredStaffLog(InjuredStaffOperatLog injuredStaffOperatLog) {
    	injuredStaffOperatLog.setSubmitTime(new Date());
    	injuredStaffOperatLog.setCreateTime(new Date());
    	injuredStaffOperatLog.setUpdateTime(new Date());
    	injuredStaffOperatLogMapper.insertSelective(injuredStaffOperatLog);
    }
}
