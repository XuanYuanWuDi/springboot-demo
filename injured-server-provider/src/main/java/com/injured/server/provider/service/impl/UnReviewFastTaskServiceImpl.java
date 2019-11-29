package com.injured.server.provider.service.impl;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.injured.server.api.entity.InjuredFastCompensatInfo;
import com.injured.server.api.entity.InjuredFastCompensatInfoExample;
import com.injured.server.api.enums.IsDeleteEnum;
import com.injured.server.api.enums.ReviewStatusEnum;
import com.injured.server.api.enums.TaskStatusEnum;
import com.injured.server.provider.mapper.InjuredFastCompensatInfoMapper;
import com.injured.server.provider.mq.MQProducerService;

/**
 * 
 * 处理未派工任务
 * @author cli
 *
 */
@Component
public class UnReviewFastTaskServiceImpl {
	
	private static Logger logger = LogManager.getLogger(UnReviewFastTaskServiceImpl.class);

	@Autowired
	private MQProducerService mQProducerService;
	
	@Autowired
	private InjuredFastCompensatInfoMapper injuredFastCompensatInfoMapper;
	
	public void doUnReviewFastTask() {
		
		List<InjuredFastCompensatInfo> injuredFastCompensatInfos = getUnReviewFastTask();
		/**
		 * 判断是否有任务  存入缓存
		 */
		if(injuredFastCompensatInfos != null && injuredFastCompensatInfos.size() != 0) {
			for(InjuredFastCompensatInfo injuredFastCompensatInfo : injuredFastCompensatInfos) {
				mQProducerService.sendDispatchedWorkerMessage(String.valueOf(injuredFastCompensatInfo.getId()));
			}
		}
	}
	
	/**
	 * 快赔未派工任务
	 */
	public List<InjuredFastCompensatInfo> getUnReviewFastTask() {
		
		InjuredFastCompensatInfoExample injuredFastCompensatInfoExample = new InjuredFastCompensatInfoExample();
		injuredFastCompensatInfoExample.createCriteria().andTaskStatusEqualTo(TaskStatusEnum.PROCESSED.getCode())
														.andReviewStatusIn(Arrays.asList(ReviewStatusEnum.TO_REVIEWED.getCode(),ReviewStatusEnum.PRIMARY_REVIEWED.getCode()))
														.andIsDeletedEqualTo(IsDeleteEnum.NO.getCode());
		injuredFastCompensatInfoExample.setOrderByClause("create_time desc");
		List<InjuredFastCompensatInfo> injuredFastCompensatInfos = injuredFastCompensatInfoMapper.selectByExample(injuredFastCompensatInfoExample);
		logger.info("获取派工池中任务列表：{}",JSON.toJSONString(injuredFastCompensatInfos));
		return injuredFastCompensatInfos;
	}
}
