package com.dailycode.MultiThreadings;

public class Main {
    public static void main(String[] args) {
        System.out.println("goes inside the main method:"+Thread.currentThread().getName());
//        MultiThreadLearning2 multiThreadLearning2=new MultiThreadLearning2();
//        Thread thread=new Thread(multiThreadLearning2);
        MultiThreadLearning2Way2 multiThreadLearning2Way2=new MultiThreadLearning2Way2();
        Thread thread=new Thread(multiThreadLearning2Way2);
        thread.start();
        System.out.println("done with main method:"+Thread.currentThread().getName());
    }
}
