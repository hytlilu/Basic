/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package test;


import org.junit.Assert;
import org.junit.Test;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * AssertTest
 *
 * @author lilu
 * @since 2018-02-24
 */
public class AssertTest {
    public static void main(String[] args){
        String a = null;
        try {
            Assert.assertNotNull(a);

        }catch (AssertionError error){
            System.out.println(error.getMessage());
        }

//        Assert.assertTrue(1==1);
    }

    @Test
    public void test(){
        String a = "";
        int b = a.length();
        int c= 0;

        NumberFormat formatter = NumberFormat.getInstance();
        formatter.setMaximumFractionDigits(1);
        formatter.setMinimumFractionDigits(0);
        String aa = formatter.format(3);
        Assert.assertNotNull(a);
    }

    @Test
    public void testNumber() {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String ("abc");
        String s5 = "a";

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println(s1==("a"+"bc"));
        System.out.println(s1==(s5+"bc"));

    }

}