package com.dailycode.MultiThreadings;

public class MultiThreadLearning2Way2 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running..."+ Thread.currentThread().getName());
    }
}
