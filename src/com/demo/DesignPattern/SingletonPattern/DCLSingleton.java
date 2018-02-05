/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.DesignPattern.SingletonPattern;

/**
 * DCLSingleton
 *
 * @author lilu
 * @since 2018-01-30
 */

/**
 * Double CheckLock 实现单例
 * 双重锁定懒汉式
 */
public class DCLSingleton {
    private static DCLSingleton instance = null;

    private DCLSingleton() {
    }

    /**
     * 优点：资源利用率高，既能在需要的时候才初始化实例，又能保证线程安全，同时调用
     *         getInstance()方法不进行同步锁，效率高。
     * 缺点：第一次加载时稍慢，由于Java内存模型的原因偶尔会失败。在高并发环境下也有一定的
     *         缺陷，虽然发生概率很小。
     * DCL模式是使用最多的单例模式实现方法，除非代码在并发场景比较复杂或者JDK6以下的版本使用
     * 否则，这种方式基本都能满足需求。
     * @return
     */
    public static DCLSingleton getInstance(){
        //两层判空，第一层为了避免不必要的同步
        if(instance == null){
            synchronized (DCLSingleton.class){
                //第二层为了在null的情况下创建实例
                if(instance == null){
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
}