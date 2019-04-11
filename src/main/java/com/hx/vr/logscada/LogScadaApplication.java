package com.hx.vr.logscada;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan("com.hx.vr.logscada.modules.*.dao")
/**
 *表示自己启动cglib代理，并且exposeProxy配置为true表示可以横切关注点中使用AopContext这个类
 */
@EnableAspectJAutoProxy(proxyTargetClass = true,exposeProxy = true)
/**
 * 首先要将spring boot自带的DataSourceAutoConfiguration禁掉，因为它会读取application.properties文件的spring.datasource.*属性并自动配置单数据源。
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class LogScadaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogScadaApplication.class, args);
    }


    /**
     在application.properties中配置spring.devtools.restart.enabled=false，此时restart类加载器还会初始化，但不会监视文件更新。在SprintApplication.run之前调用System.setProperty(“spring.devtools.restart.enabled”, “false”);可以完全关闭重启支持。
     */
}
