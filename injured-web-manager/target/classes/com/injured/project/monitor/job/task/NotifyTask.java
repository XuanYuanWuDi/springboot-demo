package com.injured.project.monitor.job.task;

import com.alibaba.dubbo.config.annotation.Reference;
import com.injured.server.api.contract.InjuredNotifyTaskContract;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zlu
 * @title: NotifyTask
 * @projectName workspaces
 * @description: 异步通知任务
 * @date 2019/5/1311:14
 */
@Component("notifyTask")
public class NotifyTask {
    private static final Logger logger = LoggerFactory.getLogger(NotifyTask.class);

    private Lock notifyLock = new ReentrantLock();

    @Reference(timeout = 60000)
    private InjuredNotifyTaskContract injuredNotifyTaskContract;

        public void notifySend() {
        if (this.notifyLock.tryLock()) {
            logger.info("异步回调任务------BEGIN");
            injuredNotifyTaskContract.task();
            logger.info("异步回调任务------END");
        } else {
            logger.info("异步回调任务线程{}尝试获取锁失败------", Thread.currentThread().getName());
        }

    }

}
