/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.DesignPattern.ProxyPattern;

/**
 * RealImage
 *
 * @author lilu
 * @since 2018-01-30
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying"+fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading"+fileName);
    }
}