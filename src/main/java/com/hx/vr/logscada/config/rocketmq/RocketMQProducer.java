package com.hx.vr.logscada.config.rocketmq;

import com.aliyun.openservices.ons.api.ONSFactory;
import com.aliyun.openservices.ons.api.Producer;
import com.aliyun.openservices.ons.api.PropertyKeyConst;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.Properties;
@Slf4j
@Configuration
public class RocketMQProducer {

    @Autowired
    private RocketMQConfig rocketMQConfig;

    @Bean(initMethod = "start",destroyMethod = "shutdown")
    public Producer getProducer(){
        log.info("==========================rocketmq producer 正在创建中==========================");
        Properties properties = new Properties();
        properties.setProperty(PropertyKeyConst.GROUP_ID, rocketMQConfig.getProducer().get("groupId"));
        // AccessKey 阿里云身份验证，在阿里云服务器管理控制台创建
        properties.put(PropertyKeyConst.AccessKey,rocketMQConfig.getAccessKey());
        // SecretKey 阿里云身份验证，在阿里云服务器管理控制台创建
        properties.put(PropertyKeyConst.SecretKey, rocketMQConfig.getSecretKey());
        //设置发送超时时间，单位毫秒
        properties.setProperty(PropertyKeyConst.SendMsgTimeoutMillis, rocketMQConfig.getSendMsgTimeoutMillis());
        // 设置 TCP 接入域名，到控制台的实例基本信息中查看
        properties.put(PropertyKeyConst.NAMESRV_ADDR,
                rocketMQConfig.getNamesrvAddr());
        Producer producer = ONSFactory.createProducer(properties);
        // 在发送消息前，必须调用 start 方法来启动 Producer，只需调用一次即可
        log.info("==========================rocketmq producer 配置完毕==========================");
        return producer;
    }

}
