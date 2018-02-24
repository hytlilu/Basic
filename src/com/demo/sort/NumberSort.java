/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.sort;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * NumberSort
 *
 * @author lilu
 * @since 2018-02-24
 */
public class NumberSort {

    public static void main(String[] args){
        String str = "河东1大6";
        String regex = "\\d";
        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(str);
        while(m.find()){
            if(!"".equals(m.group())){
                System.out.println(m.group());
            }
        }
    }

}