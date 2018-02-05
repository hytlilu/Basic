/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.DesignPattern.AdapterPattern;

/**
 * Client
 *
 * @author lilu
 * @since 2018-01-30
 */
public class Client {
    public static void main(String[] args){
        //创建通用usb线的实例
        UsbCable myCable = new UsbCable();

        //创建一个adapter，将通用线转成Lightening接口
        Lightening lighteningCable = new UsbToLighteningAdapter(myCable);

        //开始充电
        lighteningCable.chargeIphone();
    }
}