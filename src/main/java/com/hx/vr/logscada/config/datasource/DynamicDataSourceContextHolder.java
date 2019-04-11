package com.hx.vr.logscada.config.datasource;

import com.hx.vr.logscada.common.enums.DataSourceName;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 设置数据源上下文
 */
public class DynamicDataSourceContextHolder {

    /**
     * ThreadLocal是一个本地线程副本变量工具类。主要用于将私有线程和该线程存放的副本对象做一个映射，各个线程之间的变量互不干扰，在高并发场景下，
     * 可以实现无状态的调用，特别适用于各个线程依赖不通的变量值完成操作的场景。
     * 每个Thread线程内部都有一个Map。
     Map里面存储线程本地对象（key）和线程的变量副本（value）
     但是，Thread内部的Map是由ThreadLocal维护的，由ThreadLocal负责向map获取和设置线程的变量值。
     所以对于不同的线程，每次获取副本值时，别的线程并不能获取到当前线程的副本值，形成了副本的隔离，互不干扰。
     *
     */
    private final static ThreadLocal<DataSourceName> CONTEXT_HOLDER = new ThreadLocal<>();

    /**
     * 用于保存当前线程的副本变量值
     * @param name
     */
    public static void setDataSource(DataSourceName name){
        CONTEXT_HOLDER.set(name);
    }

    /**
     * 方法用于获取当前线程的副本变量值
     */
    public static DataSourceName getDataSource(){
        return CONTEXT_HOLDER.get();
    }

    public static void clearDataSource(){
        CONTEXT_HOLDER.remove();
    }
}
