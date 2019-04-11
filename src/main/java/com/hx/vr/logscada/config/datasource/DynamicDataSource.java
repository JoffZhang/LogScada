package com.hx.vr.logscada.config.datasource;

import com.hx.vr.logscada.common.enums.DataSourceName;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;


/**
 * AbstractRoutingDataSource 实现类 ，实现AOP动态切换的关键
 */
@Slf4j
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        DataSourceName dataSource = DynamicDataSourceContextHolder.getDataSource();
        return dataSource;
    }
}
