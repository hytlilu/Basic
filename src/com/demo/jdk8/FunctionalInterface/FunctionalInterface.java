/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.jdk8.FunctionalInterface;

/**
 * FunctionalInterface
 *
 * @author lilu
 * @since 2018-01-22
 */

/**
 * 函数式接口
 */
@java.lang.FunctionalInterface
public interface FunctionalInterface {
    public String doit(Integer i);

//    public void hello();报错，函数式接口只能包含一个未实现的方法

    //默认方法和静态方法并不影响函数式接口的契约，是可以使用的
    default void defaultMethod(){}
    static void staticMethod(){}
}
