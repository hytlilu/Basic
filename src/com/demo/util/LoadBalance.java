/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.util;

import java.util.*;

/**
 * LoadBalance
 *
 * @author lilu
 * @since 2018-12-13
 */
public class LoadBalance {
//    static Map<String, Integer> keyMap = new HashMap<>();
    Integer pos = 0;

    public String getKey(List<String> keys) {
        String key;
        synchronized (pos) {
            if (pos >= keys.size()) {
                pos = 0;
            }
            key = keys.get(pos);
            pos++;
        }
        return key;
    }

    public static void main(String[] args) {
        List<String> keys = new ArrayList<>();
        keys.add("a");
        LoadBalance loadBalance = new LoadBalance();
        for (int i = 0; i < 40; i++) {
            if (i==5){
                keys.add("b");
            }
            if (i==10){
                keys.add("c");
            }
            if (i==20){
                keys.add("d");
            }
            if (i==30){
                keys.add("b");
            }
            System.out.println(i+"key:" + loadBalance.getKey(keys));
        }
    }
}