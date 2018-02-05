/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.DesignPattern.ProxyPattern;

/**
 * ProxyPatternDemo
 *
 * @author lilu
 * @since 2018-01-30
 */
public class ProxyPatternDemo {
    public static void main(String[] args){
        Image image = new ProxyImage("test_lilu.jpg");
        //图像将从磁盘加载
        image.display();
        System.out.println("");
//        //图像无法从磁盘加载
//        image.display();
    }

}