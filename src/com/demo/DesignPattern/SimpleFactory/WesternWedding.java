/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.DesignPattern.SimpleFactory;

/**
 * WesternWedding
 *
 * @author lilu
 * @since 2018-01-26
 */

/**
 * 西式婚礼实现类
 */
public class WesternWedding extends Wedding{

    @Override
    protected void wed() {
        System.out.println("西式婚礼");
    }
}