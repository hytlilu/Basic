/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.DesignPattern.DecoratorPattern;

/**
 * Worker
 *
 * @author lilu
 * @since 2018-02-01
 */

/**
 * 定义个具体的实例类实现接口，工人类
 */
public class Worker extends People{
    public Worker(String name) {
        super(name);
    }

    @Override
    public void dressed() {
        System.out.println("穿工人装");
    }
}