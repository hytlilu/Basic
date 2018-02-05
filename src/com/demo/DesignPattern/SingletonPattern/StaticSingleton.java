/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.DesignPattern.SingletonPattern;

/**
 * StaticSingleton
 *
 * @author lilu
 * @since 2018-01-30
 */

/**
 * 静态内部类实现单例模式
 */
public class StaticSingleton {
    private StaticSingleton(){
    }

    /**
     * 第一次加载StaticSingleton类时不会初始化instance，只有在第一次
     * 调用getInstance(）方法时，虚拟机会加载SingletonHolder类，初始化instance
     *
     * 这种方法既保证线程安全，单例对象唯一，也延迟了单例的初始化，推荐使用这种方式
     * @return
     */
    public static StaticSingleton getInstance(){
        return SingletonHolder.instance;
    }

    /**
     * 静态内部类
     */
    private static class SingletonHolder{
        private static StaticSingleton instance = new StaticSingleton();
    }
}