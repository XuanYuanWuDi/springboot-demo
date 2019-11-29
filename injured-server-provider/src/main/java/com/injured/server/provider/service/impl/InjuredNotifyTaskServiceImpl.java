package com.injured.server.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.injured.commons.DateUtil;
import com.injured.commons.http.OkHttpUtils;
import com.injured.server.api.contract.InjuredNotifyTaskContract;
import com.injured.server.api.entity.InjuredNotifyTask;
import com.injured.server.api.enums.NotifyTaskContentTypeEnum;
import com.injured.server.api.enums.NotifyTaskEnum;
import com.injured.server.provider.mapper.InjuredNotifyTaskMapper;
import okhttp3.MediaType;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * @author zlu
 * @title: InjuredNotifyTaskServiceImpl
 * @projectName injured
 * @description: 异步任务
 * @date 2019/7/2714:47
 */
@Service
public class InjuredNotifyTaskServiceImpl implements InjuredNotifyTaskContract {

    Logger logger = LoggerFactory.getLogger(InjuredNotifyTaskServiceImpl.class);

    //最大重试次数
    private static final Integer NUMBER_MAX = 5;
    //发送间隔时间（单位分钟）
    private static final Long TIME_MAX = 5L;

    @Autowired
    private InjuredNotifyTaskMapper injuredNotifyTaskMapper;

    @Override
    public void task() {
        logger.info("异步回调----------服务端BEGIN");

        try {
            InjuredNotifyTask notifyTask = new InjuredNotifyTask();
            notifyTask.setState(NotifyTaskEnum.NOTIFY_TASK_STATE_WAIT.getCode());
            notifyTask.setNotifyNumber(NUMBER_MAX);
            Date notifyLastTime = DateUtil.dateMinusMinutes(LocalDateTime.now(), TIME_MAX);
            notifyTask.setNotifyLastTimeBegin(notifyLastTime);
            notifyTask.setNotifyLastTimeEnd(DateUtil.getStartOfDay(new Date()));
            List<InjuredNotifyTask> tasks = injuredNotifyTaskMapper.selectNotifyTaskUnsent(notifyTask);

            logger.info("异步回调查询到的任务数量为{}",tasks.size());

            for(InjuredNotifyTask task:tasks){
                if ((StringUtils.isNotBlank(task.getNotifyParam()) || StringUtils.isNotBlank(task.getNotifyOtherParam())) && StringUtils.isNotBlank(task.getNotifyUrl())) {
                    String result = null;
                    try {
                        logger.info("异步回调,请求URL为{}，请求参数为{}",task.getNotifyUrl(),task.getNotifyParam());
                        if(StringUtils.isNotBlank(task.getNotifyParam())) {
                            result = OkHttpUtils.post(task.getNotifyUrl(), task.getNotifyParam());
                        }else if(NotifyTaskContentTypeEnum.TEXT.getCode().equals(task.getNotifyParamType())){
                            result = OkHttpUtils.postOtherMediaType(task.getNotifyUrl(), task.getNotifyOtherParam(), MediaType.parse(OkHttpUtils.TEXT_PLAIN));
                        }else{
                            result = OkHttpUtils.postOtherMediaType(task.getNotifyUrl(), task.getNotifyOtherParam(), MediaType.parse(OkHttpUtils.APPLICATION_XML));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        logger.error("异步回调请求异常,任务ID为{}", task.getId(),e);
                        result = e.getMessage();
                    }
                    logger.info("异步回调,任务ID为{}------,通知任务结束,结果为{}", task.getId(), result);
                    if(StringUtils.isNotBlank(result)){
                        try {
                            JSONObject jsonResult = JSONObject.parseObject(result);
                            if ("200".equals(jsonResult.get("code"))) {
                                task.setState(NotifyTaskEnum.NOTIFY_TASK_STATE_SUCCESS.getCode());
                            }
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                    }

                    task.setNotifyNumber(task.getNotifyNumber() + 1);
                    task.setNotifyLastTime(new Date());
                    task.setUpdateTime(new Date());
                    task.setNotifyResult(result);
                    int updateResult = injuredNotifyTaskMapper.updateByPrimaryKeySelective(task);
                    if (updateResult != 1) {
                        logger.info("异步回调,任务ID为{}------,更新通知任务状态,更新失败", task.getId());
                    }
                } else {
                    logger.info("异步回调,任务ID为{}------,处理失败,任务通知参数或通知地址为空", task.getId());
                }
            }
        } catch (Exception e) {
            logger.error("异步回调任务----------服务端异常", e);
            e.printStackTrace();
        }
    }

    @Override
    public void saveInjuredNotifyTask(InjuredNotifyTask task) {
        injuredNotifyTaskMapper.insertSelective(task);
    }
}
