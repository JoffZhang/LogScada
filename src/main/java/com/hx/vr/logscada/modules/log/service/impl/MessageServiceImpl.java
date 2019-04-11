package com.hx.vr.logscada.modules.log.service.impl;

import com.aliyun.openservices.ons.api.*;
import com.hx.vr.logscada.common.utils.JSONUtils;
import com.hx.vr.logscada.config.rocketmq.RocketMQConfig;
import com.hx.vr.logscada.modules.log.model.BoxOperationLog;
import com.hx.vr.logscada.modules.log.service.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private Producer producer;
    @Autowired
    private RocketMQConfig rocketMQConfig;

    @Override
    public void sendAsycMsg(String body) {
        try {
            Message message = new Message(
                    rocketMQConfig.getProducer().get("topic"),
                    rocketMQConfig.getProducer().get("tag"),
                    body.getBytes("UTF-8")
            );
            producer.sendAsync(message, new SendCallback() {
                @Override
                public void onSuccess(SendResult sendResult) {
                    // 消费发送成功
                    log.info("send message success. topic=" + sendResult.getTopic() + ", msgId=" + sendResult.getMessageId());
                }

                @Override
                public void onException(OnExceptionContext context) {
                    // 消息发送失败，需要进行重试处理，可重新发送这条消息或持久化这条数据进行补偿处理
                    log.info("send message failed. topic=" + context.getTopic() + ", msgId=" + context.getMessageId());
                }
            });
            // 在 callback 返回之前即可取得 msgId。
            log.info("send message async. topic=" + message.getTopic() + ", msgId=" + message.getMsgID());
        }catch (Exception e) {
            log.error("发送失败,Topic:{},Tag:{}body为{}",new Object[]{rocketMQConfig.getProducer().get("topic"), rocketMQConfig.getProducer().get("tag"),body});
        }
    }
}
