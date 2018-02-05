/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.reflect;

import java.lang.reflect.Field;

/**
 * ReflectDemo3
 *
 * @author lilu
 * @since 2018-01-24
 */

/**
 * 反射获取类的成员变量
 */
public class ReflectDemo3 {
    public static void main(String[] args) {
        try {
            Class<?> clz = Class.forName("com.demo.reflect.Student");
            Field[] fields = clz.getDeclaredFields();//获取所有的类类型
            for (Field field:fields) {
                Class fieldType = field.getType();
                String typeName = fieldType.getName();//获取成员变量的类型
                String fieldName = field.getName();//获取成员变量的名称
                System.out.println(typeName);
                System.out.println(fieldName);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}