/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.DesignPattern.SimpleFactory;

/**
 * ChineseWedding
 *
 * @author lilu
 * @since 2018-01-26
 */

/**
 * 中式婚礼实现类
 */
public class ChineseWedding extends Wedding{
    @Override
    protected void wed() {
        System.out.println("中式婚礼");
    }
}