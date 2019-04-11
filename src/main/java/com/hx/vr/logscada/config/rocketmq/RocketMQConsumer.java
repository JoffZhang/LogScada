package com.hx.vr.logscada.config.rocketmq;

import com.aliyun.openservices.ons.api.Consumer;
import com.aliyun.openservices.ons.api.ONSFactory;
import com.aliyun.openservices.ons.api.PropertyKeyConst;
import com.aliyun.openservices.ons.api.PropertyValueConst;
import com.hx.vr.logscada.modules.log.service.impl.LogMessageListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;
@Slf4j
@Configuration
public class RocketMQConsumer {

    @Autowired
    private RocketMQConfig rocketMQConfig;
    @Autowired
    private LogMessageListener logMessageListener;


    @Bean(initMethod = "start",destroyMethod = "shutdown")
    public Consumer getConsumer(){
        log.info("==========================rocketmq consumer 正在创建中==========================");
        Properties properties = new Properties();
        properties.setProperty(PropertyKeyConst.GROUP_ID, rocketMQConfig.getConsumer().get("groupId"));
        // AccessKey 阿里云身份验证，在阿里云服务器管理控制台创建
        properties.put(PropertyKeyConst.AccessKey,rocketMQConfig.getAccessKey());
        // SecretKey 阿里云身份验证，在阿里云服务器管理控制台创建
        properties.put(PropertyKeyConst.SecretKey, rocketMQConfig.getSecretKey());
        // 设置 TCP 接入域名，到控制台的实例基本信息中查看
        properties.put(PropertyKeyConst.NAMESRV_ADDR, rocketMQConfig.getNamesrvAddr());
        // 集群订阅方式设置（不设置的情况下，默认为集群订阅方式）
        properties.put(PropertyKeyConst.MessageModel, PropertyValueConst.CLUSTERING);
        Consumer consumer = ONSFactory.createConsumer(properties);
        consumer.subscribe(rocketMQConfig.getConsumer().get("topic"),rocketMQConfig.getConsumer().get("tag"),logMessageListener);
        log.info("==========================rocketmq consumer 配置完毕==========================");
        return consumer;
    }

}
