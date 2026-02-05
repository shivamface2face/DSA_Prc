package com.dailycode.MultiThreadings;

public class MultiThreadLearning2 implements Runnable{

    @Override
    public void run() {
        System.out.println("thread is running..."+ Thread.currentThread().getName());
    }
}
