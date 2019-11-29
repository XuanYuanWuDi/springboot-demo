package com.injured.server.provider.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.injured.server.api.contract.FastDispatchedWorkerContract;
import com.injured.server.provider.service.impl.UnReviewFastTaskServiceImpl;

/**
 * 
 * 快赔定损派工定时任务
 * @author cli
 *
 */
@Component
@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling   // 2.开启定时任务
public class DispatchedWorkerScheduleTask {
	
	@Autowired
	private UnReviewFastTaskServiceImpl unReviewFastTaskServiceImpl;

	/**
	 * 定时任务  扫描未派工定时
	 */
	@Scheduled(fixedDelay = 1000 * 60)
	public void putCacheUnReviewFastTask() {
		unReviewFastTaskServiceImpl.doUnReviewFastTask();
	}
}
