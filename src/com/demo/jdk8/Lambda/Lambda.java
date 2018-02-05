/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.jdk8.Lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Lambda
 *
 * @author lilu
 * @since 2018-01-22
 */

/**
 * Lambda表达式
 */
public class Lambda {

    @Test
    public void test(){
        List<String> list = Arrays.asList("haha","lala","hehe");

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        //jdk8 lambda 表达式
        Collections.sort(list,(String a,String b)->{
            return a.compareTo(b);
        });

        Collections.sort(list,(String a,String b)->a.compareTo(b));
        Collections.sort(list,String::compareTo);
    }

    @Test
    public void test2(){
        Runnable runnable = ()-> System.out.println(1);

        Runnable runnable1 =() ->{
          System.out.println(2);
          System.out.println(3);
        };

        runnable1.run();
        runnable.run();
    }


}