package com.hx.vr.logscada.config.datasource;

import com.hx.vr.logscada.common.enums.DataSourceName;

import java.lang.annotation.*;

/**
 *@Retention: 定义注解的保留策略,注解会在class字节码文件中存在，在运行时可以通过反射获取到
 *@Target：定义注解的作用目标
 *@Documented  说明该注解将被包含在javadoc中
 *@Inherited 说明子类可以继承父类中的该注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({
        ElementType.METHOD,
        ElementType.TYPE
})
@Documented
@Inherited
public @interface TargetDataSource {
    DataSourceName sourceName();
}
