package com.hx.vr.logscada.config.datasource;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Slf4j
/**
 * AOP切换数据源
 */
@Aspect
/**
 * 设置AOP执行顺序（需要在事务之前）
 */
@Order(-10)
@Component
public class DataSourceAspect {

    @Before("@annotation(ds)")
    private void before(JoinPoint point, TargetDataSource ds){
        dynamicSwitch(point,ds);
    }

    private void dynamicSwitch(JoinPoint point,TargetDataSource ds) {
        //获取访问的方法名
        String method = point.getSignature().getName();
        //获取当前访问的类
        Class<?> aClass = point.getTarget().getClass();
        //得到方法的参数类型
        MethodSignature methodSignature  = (MethodSignature)point.getSignature();
        Class<?>[] parameterTypes = methodSignature.getMethod().getParameterTypes();
        try {
            //得到访问的方法对象
            Method m = aClass.getMethod(method, parameterTypes);
            //判断是否存在@DataSourceAop注解
            if(m.isAnnotationPresent(TargetDataSource.class)){
                TargetDataSource annotation = m.getAnnotation(TargetDataSource.class);
                DynamicDataSourceContextHolder.setDataSource(annotation.sourceName());
                log.info("=======================上下文赋值完成：{}================================{}",annotation.sourceName(),ds.sourceName());
            }
        }catch (Exception e) {
            log.error("数据源切换异常");
            e.printStackTrace();
        }
    }

    @After("@annotation(ds)")
    private void clearDataSource(JoinPoint point, TargetDataSource ds){
        log.info("=======================清除本地线程副本数据源变量{}================================",ds.sourceName());
        DynamicDataSourceContextHolder.clearDataSource();
    }
}
