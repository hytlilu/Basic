/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package test;

import com.demo.Enum.Entity;
import com.demo.Enum.EnumDemo;

/**
 * EnumTest
 *
 * @author lilu
 * @since 2018-01-23
 */
public class EnumTest {

    public static void main(String[] args){
        Entity entity = new Entity();
        entity.setId(1);
        entity.setType(EnumDemo.AUDIO);
        System.out.println(EnumDemo.values());
    }
}