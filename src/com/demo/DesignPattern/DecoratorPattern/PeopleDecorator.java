/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.DesignPattern.DecoratorPattern;

/**
 * PeopleDecorator
 *
 * @author lilu
 * @since 2018-02-01
 */
public class PeopleDecorator extends People{
    private People people;
    public PeopleDecorator(People people,String name) {
        super(name);
        this.people = people;
    }

    @Override
    public void dressed() {
        people.dressed();
    }
}