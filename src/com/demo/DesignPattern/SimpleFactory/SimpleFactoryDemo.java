/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.DesignPattern.SimpleFactory;

/**
 * SimpleFactoryDemo
 *
 * @author lilu
 * @since 2018-01-26
 */
public class SimpleFactoryDemo {
    public static void main(String[] args){
        Wedding wedding = WeddingFactory.selectWeddingStyle("chinese");
        wedding.setBirdegroom("张三");
        wedding.setBirde("李四");
        wedding.wed();
    }
}