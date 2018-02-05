/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.DesignPattern.SingletonPattern;

/**
 * HungarySingleton
 *
 * @author lilu
 * @since 2018-01-30
 */

/**
 * 饿汉式单例
 *
 * 预先进行初始化实例，提供一个公开调用方法，
 */
public class HungarySingleton {
    private static HungarySingleton instance = new HungarySingleton();

    private HungarySingleton(){

    }

    public static HungarySingleton getInstance(){
        return instance;
    }
}