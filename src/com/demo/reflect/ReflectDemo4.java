/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.reflect;

/**
 * ReflectDemo4
 *
 * @author lilu
 * @since 2018-01-24
 */

import java.lang.reflect.Constructor;

/**
 * 反射获取类的构造函数
 */
public class ReflectDemo4 {
   public static void main(String[] args){
       try {
           Class clz = Class.forName("com.demo.reflect.Student");
           Constructor[] constructors = clz.getConstructors();
           for (Constructor constructor:constructors) {
               //constructor
               System.out.println(constructor.getName());
           }
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
   }
}