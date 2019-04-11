package com.hx.vr.logscada.config.rocketmq;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Hashtable;
@Data
@Component
@ConfigurationProperties(prefix = "aliyun.rocketmq")
public class RocketMQConfig {

    private String accessKey;
    private String secretKey;
    private String namesrvAddr;
    private String sendMsgTimeoutMillis;
    private Hashtable<String,String> producer;
    private Hashtable<String,String> consumer;

}
