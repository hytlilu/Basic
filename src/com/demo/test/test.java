/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * test
 *
 * @author lilu
 * @since 2018-04-19
 */
public class test {
    public static void main(String[] args){
        Integer a = 1;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String date1 = simpleDateFormat.format(date);
        System.out.println(date);
        System.out.println(date1);

        String test = "";
        System.out.println("test:"+test.length());
        System.out.println(System.currentTimeMillis());
    }
}