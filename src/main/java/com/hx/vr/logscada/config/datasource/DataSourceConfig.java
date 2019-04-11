package com.hx.vr.logscada.config.datasource;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.hx.vr.logscada.common.enums.DataSourceName;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Properties;

@Slf4j
@Configuration
public class DataSourceConfig {


    @Bean(name = "logScadaMasterDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.druid.db-logscada")
    public DataSource logScadaMasterDataSource(){
        log.debug("=========================加载logScada配置=========================");
        return DruidDataSourceBuilder.create().build();
    }
    @Bean(name = "thinkAdminMasterDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.druid.db-thinkadmin")
    public DataSource thinkAdminMasterDataSource(){
        log.debug("=========================加载thinkAdmin配置=========================");
        return DruidDataSourceBuilder.create().build();
    }


    @Bean(name = "dynamicDataSource")
    @Primary
    public DataSource dataSource(@Qualifier("logScadaMasterDataSource")DataSource logScadaMasterDataSource,@Qualifier("thinkAdminMasterDataSource")DataSource thinkAdminMasterDataSource){
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        //设置默认数据源
        dynamicDataSource.setDefaultTargetDataSource(logScadaMasterDataSource);
        //配置多数据源
        HashMap<Object, Object> map = new HashMap<>(2,2);
        //key需要和ThreadLocal中的值对应
        map.put(DataSourceName.LOGSCADA,logScadaMasterDataSource);
        map.put(DataSourceName.THINKADMIN,thinkAdminMasterDataSource);
        dynamicDataSource.setTargetDataSources(map);
        return dynamicDataSource;
    }
}
