/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.DesignPattern.DecoratorPattern;

/**
 * HATDecorator
 *
 * @author lilu
 * @since 2018-02-01
 */

/**
 * 定义装饰的一个具体类
 */
public class HATDecorator extends PeopleDecorator{
    public HATDecorator(People people,String name){
        super(people,name);
    }

    @Override
    public void dressed() {
        super.dressed();
        wearHat();
    }
    public void wearHat(){
        System.out.println("戴帽子");
    }
}