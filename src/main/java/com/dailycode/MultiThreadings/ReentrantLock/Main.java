package com.dailycode.MultiThreadings.ReentrantLock;

public class Main {
    public static void main(String args[]){
         SharedResource sharedResource=new SharedResource();
         Thread thread1=new Thread(()->sharedResource.producer());
         Thread thread2=new Thread(()->sharedResource.producer());
         thread1.start();
         thread2.start();
    }
}
