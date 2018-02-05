/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.DesignPattern.SimpleFactory;

/**
 * Wedding
 *
 * @author lilu
 * @since 2018-01-26
 */

/**
 * 抽象婚礼类
 */
public abstract class Wedding {
    /**
     * 新郎
     */
    private String birdegroom;
    /**
     * 新娘
     */
    private String birde;

    public String getBirdegroom() {
        return birdegroom;
    }

    public void setBirdegroom(String birdegroom) {
        this.birdegroom = birdegroom;
    }

    public String getBirde() {
        return birde;
    }

    public void setBirde(String birde) {
        this.birde = birde;
    }
    /**
     * 举行婚礼仪式
     */
    protected abstract void wed();
}