/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.DesignPattern.AdapterPattern;

/**
 * UsbToLighteningAdapter
 *
 * @author lilu
 * @since 2018-01-30
 */

/**
 * 普通usb转Lightening的适配器
 */
public class UsbToLighteningAdapter implements Lightening{
    UsbCable mCable;//普通usb线实例

    public UsbToLighteningAdapter(UsbCable mCable) {
        System.out.println("Set adapter...");
        this.mCable = mCable;
    }

    /**
     * 充Iphone的时候用普通usb线的充电行为代替
     */
    @Override
    public void chargeIphone() {
        System.out.println("Charging Iphone...");
        mCable.charge();
    }
}