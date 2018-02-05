/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.DesignPattern.SingletonPattern;

/**
 * EnumSingleton
 *
 * @author lilu
 * @since 2018-01-31
 */

/**
 * 枚举实现单例
 *
 * 默认枚举实例的创建是线程安全的，即使反序列化也不会生成新的实例
 * 任何情况下都是一个单例。
 *
 * 优点：简单
 */
public enum  EnumSingleton {
    INSTANCE;
    public void doSomething(){
        System.out.println("do something");
    }
}