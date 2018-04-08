/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.excel;

import java.util.Calendar;
import java.util.Date;

/**
 * ExcelDemo
 *
 * @author lilu
 * @since 2018-03-19
 */
public class ExcelDemo {

    public static void main(String[] args){
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.println(list.toString());
        Byte a = Byte.parseByte("2");
        Byte b = Byte.valueOf("3");
        System.out.println(a);
        System.out.println(b);

    }

    private void dates(){
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.DAY_OF_MONTH,1);
        Date firstDay = new Date(c.getTimeInMillis());
        System.out.println(date);
        System.out.println(firstDay);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        c.setTime(new Date());
        c.getTime();
        System.out.println(c.getTime());
    }
}