/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.jdk8.ExtensionMethods;

/**
 * ExtensionMethod
 *
 * @author lilu
 * @since 2018-01-22
 */

/**
 * 接口的默认方法——扩展方法
 */
public interface ExtensionMethod {
    double calculate(int a);

    //jdk8能给接口添加一个非抽象的方法实现
    default double sqrt(int a){
        return Math.sqrt(a);
    }
    //jdk8中还能添加静态方法
    static void hello(){
        System.out.println("hello");
    }
}
