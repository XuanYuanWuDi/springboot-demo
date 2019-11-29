package com.injured.server.provider.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.injured.server.api.contract.FastDispatchedWorkerContract;
import com.injured.server.api.entity.CompanyAgency;
import com.injured.server.api.entity.InjuredFastCompensatInfo;
import com.injured.server.api.model.query.FastDispatchedWorkerUserNum;
import com.injured.server.provider.mapper.CompanyAgencyMapper;
import com.injured.server.provider.mapper.InjuredFastCompensatInfoMapper;
import com.injured.server.provider.mq.MQProducerService;

@Service
public class FastDispatchedWorkerServiceImpl implements FastDispatchedWorkerContract {
	
	private static Logger logger = LogManager.getLogger(FastCompensatProcessServiceImpl.class);
	
	@Autowired
	private InjuredFastCompensatInfoMapper injuredFastCompensatInfoMapper;
	
	@Autowired
	private CompanyAgencyMapper companyAgencyMapper;
	
	@Autowired
	private MQProducerService mQProducerService;

	/**
	 * 
	 * 根据id获取快赔信息
	 * 
	 */
	@Override
	public InjuredFastCompensatInfo getDispatchedWorkerInfo(Long id) {
	
		return injuredFastCompensatInfoMapper.selectByPrimaryKey(id);
	}


	@Override
	public List<CompanyAgency> getAgencys(Long companyId) {
		
		return companyAgencyMapper.selectAllByCompany(companyId);
	}


	@Override
	public List<FastDispatchedWorkerUserNum> getUserNum(List<Long> userIds) {
		
		return injuredFastCompensatInfoMapper.getUserNum(userIds);
	}


	@Override
	public int updFastInfoToReviewerId(Long id, Long userId,String userName,Integer reviewStatus) {

		logger.info("派工更新审核人信息BEGIN,审核人ID为{},审核人姓名为{},更改审核状态为{}",userId,userName,reviewStatus);

		InjuredFastCompensatInfo injuredFastCompensatInfo = new InjuredFastCompensatInfo();
		injuredFastCompensatInfo.setId(id);
		injuredFastCompensatInfo.setReviewerId(userId);
		injuredFastCompensatInfo.setReviewerName(userName);
		injuredFastCompensatInfo.setReviewStatus(reviewStatus);
		//自动派工允许更新updatetime
		injuredFastCompensatInfo.setUpdtaeTime(new Date());
		return injuredFastCompensatInfoMapper.updateByPrimaryKeySelective(injuredFastCompensatInfo);
	}


	@Override
	public void fastDispatchedWorkerSendMessage(String fastInfoId) {
		mQProducerService.sendDispatchedWorkerMessage(fastInfoId);	
	}

}
