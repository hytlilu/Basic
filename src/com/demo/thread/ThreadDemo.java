/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.thread;

import java.util.concurrent.*;

/**
 * ThreadDemo
 *
 * @author lilu
 * @since 2018-04-08
 */
public class ThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("ThreadDemo 正在执行");
    }
    
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            ThreadDemo thread = new ThreadDemo();
            thread.start();
            System.out.println("ThreadDemo 的线程对象 " + thread.getName());
            System.out.println("线程优先级："+thread.getPriority());
        }
    }
}