package com.injured.project.compensat.mq;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import com.alibaba.rocketmq.common.message.MessageExt;
import com.injured.project.compensat.service.DispatchedWorkerService;
import com.injured.server.api.constants.FastReviewRedisConstant;
/**
 * 消费者消费消息路由
 * .<br/>
 * 
 * 
 * @ClassName: RocketMQMessageListenerConcurrentlyProcessor
 * @Description: 
 * @version: v1.0.0
 */
@Component
public class MQConsumeMsgListenerProcessor implements MessageListenerConcurrently{
	
	private static Logger logger = LogManager.getLogger(MQConsumeMsgListenerProcessor.class);
	
	@Autowired
	private DispatchedWorkerService dispatchedWorkerService;
    
    /**
     *  默认msgs里只有一条消息，可以通过设置consumeMessageBatchMaxSize参数来批量接收消息<br/>
     *  不要抛异常，如果没有return CONSUME_SUCCESS ，consumer会重新消费该消息，直到return CONSUME_SUCCESS
     */
    @Override
    public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
        if(CollectionUtils.isEmpty(msgs)){
            logger.info("MQConsumeMsgListenerProcessor-consumeMessage-接受到的消息为空，不处理，直接返回成功");
            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
        }
        MessageExt messageExt = msgs.get(0);
        logger.info("MQConsumeMsgListenerProcessor-consumeMessage-接受到的消息为：{}" ,messageExt.toString());
        if(messageExt.getTopic().equals(FastReviewRedisConstant.DispatchedWorkerTopic)){
            if(messageExt.getTags().equals(FastReviewRedisConstant.DispatchedWorkerTag)){
                //TODO 判断该消息是否重复消费（RocketMQ不保证消息不重复，如果你的业务需要保证严格的不重复消息，需要你自己在业务端去重）
                //TODO 获取该消息重试次数
                int reconsume = messageExt.getReconsumeTimes();
                if(reconsume ==3){//消息已经重试了3次，如果不需要再次消费，则返回成功
                    return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
                }
                //TODO 处理对应的业务逻辑
                
				try {
					String msg = new String(messageExt.getBody(),"UTF-8");
					logger.info("MQConsumeMsgListenerProcessor-consumeMessage-接受到的消息快赔id：{}" ,msg);
					dispatchedWorkerService.doBusiness(msg);
				} catch (UnsupportedEncodingException e) {
					logger.error("MQConsumeMsgListenerProcessor-consumeMessage-消息体转化错误");
				}              
            }
        }
        // 如果没有return success ，consumer会重新消费该消息，直到return success
        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
    }
}
