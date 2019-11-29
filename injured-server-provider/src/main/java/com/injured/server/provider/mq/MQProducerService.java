package com.injured.server.provider.mq;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.rocketmq.client.exception.MQBrokerException;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;
import com.alibaba.rocketmq.remoting.exception.RemotingException;
import com.injured.server.api.constants.FastReviewRedisConstant;

/**
 * mq 消息控制
 * @author cli
 *
 */
@Component
public class MQProducerService {
	
	private static Logger logger = LogManager.getLogger(MQProducerService.class);

	/**使用RocketMq的生产者*/
    @Autowired
    private DefaultMQProducer defaultMQProducer;
	
	public void sendMessage(String topic,String tag,String msg) {
		try {
			logger.info("MQProducerService-sendMessage-开始发送消息：{}" ,msg);
	        Message sendMsg = new Message(topic,tag,msg.getBytes());
			SendResult sendResult = defaultMQProducer.send(sendMsg);
			logger.info("MQProducerService-sendMessage-消息发送响应信息：{}"+sendResult.toString());
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}     
	}
	
	/**
	 * 派工发送消息
	 * @param msg
	 */
	public void sendDispatchedWorkerMessage(String msg) {
		sendMessage(FastReviewRedisConstant.DispatchedWorkerTopic, FastReviewRedisConstant.DispatchedWorkerTag, msg);
	}
}
