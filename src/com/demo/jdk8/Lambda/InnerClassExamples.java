/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.jdk8.Lambda;

/**
 * InnerClassExamples
 *
 * @author lilu
 * @since 2018-01-22
 */

/**
 * Lambda作用域
 */
public class InnerClassExamples {
    public static void main(String[] args){
        Hello h = new Hello();
        Hello2 h2 = new Hello2();
        h2.r.run();
        h.r.run();
    }

}
class Hello{
    public Runnable r = new Runnable() {
        public void run() {
            // 这里的this指的是匿名类，而非Hello类。
            System.out.println("1:-->1 "+this);
            System.out.println("1:-->2 "+toString());

            // 想要引用Hello类需要Hello.this这样!!!
            System.out.println("1:++1  "+Hello.this);
            System.out.println("1:++2  "+Hello.this.toString());
        }
        public String toString() {
            return "1:Hello's custom toString()";
        }
    };
}

/**
 * lambda表达式
 */
class Hello2{
    public Runnable r = () -> {
        System.out.println(this);
        System.out.println(toString());
        System.out.println("2:++1  "+Hello2.this);
        System.out.println("2:++2  "+Hello2.this.toString());
    };

    public String toString() {
        return "2:Hello's custom toString()";
    }
}