/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.DesignPattern.SimpleFactory;

/**
 * WeddingFactory
 *
 * @author lilu
 * @since 2018-01-26
 */

/**
 * 婚礼工厂
 */
public class WeddingFactory {
    public static Wedding selectWeddingStyle(String style){
        switch (style){
            case "chinese":
                return new ChineseWedding();
            case "western" :
                return new WesternWedding();
                default:return null;
        }
    }
}