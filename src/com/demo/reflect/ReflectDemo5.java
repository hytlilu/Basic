/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.reflect;

import java.lang.reflect.Method;

/**
 * ReflectDemo5
 *
 * @author lilu
 * @since 2018-01-24
 */
public class ReflectDemo5 {
    public static void main(String[] args){
        A a = new A();
        Class clz = a.getClass();
        try {
            Method print = clz.getDeclaredMethod("print",new Class[]{int.class,int.class});
            Object obj = print.invoke(a,new Object[]{10,20});
            //参数1：方法名，参数2：方法入参类型
            print = clz.getDeclaredMethod("print",String.class,String.class);
            //invoke（）执行 print 方法
            obj = print.invoke(a,"hello","world");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class A{
    public void print(int a,int b) {
        System.out.println(a+b);
    }
    public void print(String a , String b) {
        System.out.println(a.toUpperCase()+b.toUpperCase());
    }
}