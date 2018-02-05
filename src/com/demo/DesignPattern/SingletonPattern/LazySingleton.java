/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.DesignPattern.SingletonPattern;

/**
 * LazySingleton
 *
 * @author lilu
 * @since 2018-01-30
 */

/**
 * 懒汉式单例
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton(){
    }

    //synchronized方法，多线程情况下保证单例对象唯一

    /**
     * 优点：只有在使用时才会实例化单例，一定程度上节约了资源
     * 缺点：第一次加载时要立即实例化，反应稍慢。每次调用getInstance()方法
     * 都会进行同步，这样会消耗不必要的资源。这种模式一般不建议使用。
     * @return
     */
    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}