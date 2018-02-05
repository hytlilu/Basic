/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.DesignPattern.DecoratorPattern;

/**
 * Client
 *
 * @author lilu
 * @since 2018-02-01
 */
public class Client {
    public static void main(String[] args){
        People people = new Worker("工人A");
        //给工人戴帽子
        HATDecorator hatDecorator = new HATDecorator(people,"工人");
        hatDecorator.dressed();
    }
}