/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package test;


import org.junit.Assert;
import org.junit.Test;

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
    }

}