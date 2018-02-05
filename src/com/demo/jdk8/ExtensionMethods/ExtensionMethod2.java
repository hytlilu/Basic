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
public interface ExtensionMethod2 {
    double calculate(int a);

    //jdk8能给接口添加一个非抽象的方法实现
    default double sqrt(int a){
        return Math.sqrt(a);
    }
}
