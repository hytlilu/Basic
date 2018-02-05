/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.reflect;

import com.demo.Enum.Entity;
import com.demo.Enum.EnumDemo;

/**
 * ReflexDemo
 *
 * @author lilu
 * @since 2018-01-24
 */

/**
 * 获取Class对象
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         * 1.类名.class
         */
        Class c1 = EnumDemo.class;
        System.out.println(c1.getName());//获得全路径名

        /**
         * 2.getClass()方法（Object类定义）
         */
        Entity entity = new Entity();
        Class c2 = entity.getClass();
        System.out.println(c2.getName());

        /**
         * 3.Class.forName()方法
         * Class.forName(); 类加载方法
         */
        //全路径名，否则抛：java.lang.ClassNotFoundException: Entity
        Class c3 = Class.forName("com.demo.Enum.Entity");
        System.out.println(c3.getName());
        //参数1：全路径名，参数2：是否初始化，参数3：指定类加载器
        Class c4 = Class.forName("com.demo.Enum.Entity",true,ClassLoader.getSystemClassLoader());
        System.out.println(c4.getName());
    }
}