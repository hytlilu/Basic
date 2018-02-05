/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.reflect;

/**
 * ReflectDemo2
 *
 * @author lilu
 * @since 2018-01-24
 */

import java.lang.reflect.Method;

/**
 * 反射获取类的方法
 */
public class ReflectDemo2 {
    public static void main(String[] args) {
        try {
            Class<?> clz = Class.forName("com.demo.reflect.Student");
            //获取所有方法
            Method[] methods = clz.getMethods();
            for (Method method:methods) {
                System.out.print(method.getReturnType().getName()+"  ");//获取返回值的名称
                System.out.print(method.getName()+"(");//获取方法的名称
                Class[] params = method.getParameterTypes();//获取参数类型
                for (Class param:params) {
                    System.out.print(param.getName()+",");
                }
                System.out.println(")");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}