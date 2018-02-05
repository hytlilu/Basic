/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.DesignPattern.DecoratorPattern;

/**
 * People
 *
 * @author lilu
 * @since 2018-02-01
 */

/**
 * 定义一个人的抽象类
 */
public abstract class People {
    private String name;
    public People(String name){
        this.name = name;
    }

    public abstract void dressed();
}