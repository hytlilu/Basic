/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.Enum;

/**
 * EnumDemo
 *
 * @author lilu
 * @since 2018-01-23
 */
public enum EnumDemo {
    VIDEO(1,"视频"),
    AUDIO(2,"音频"),
    TEXT(3,"文本"),
    IMAGE(4,"图像");

    int value;
    String name;

    EnumDemo(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}