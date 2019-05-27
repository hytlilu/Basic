/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * QueueTest
 *
 * @author lilu
 * @since 2018-06-26
 */
public class QueueTest {

    /**
     * 队列大小
     */
    private final int QUEUE_LENGTH = 10000*10;
    /**
     * 基于内存的阻塞队列
     */
    private BlockingQueue<String> queue = new LinkedBlockingQueue<>(QUEUE_LENGTH);
    /**
     *基于ArrayBlockingQueue的阻塞队列
     */
    BlockingQueue<String> queue2 = new ArrayBlockingQueue<>(10);
    List list = new LinkedList();
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

    }
}