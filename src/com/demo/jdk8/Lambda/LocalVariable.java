/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.jdk8.Lambda;

/**
 * LocalVariable
 *
 * @author lilu
 * @since 2018-01-22
 */
public class LocalVariable {
    public static void main(String[] args){
        String message = "Hello,lilu";
        Runnable runnable = () ->System.out.println(message);
        runnable.run();

//        message = "change message";
    }
}