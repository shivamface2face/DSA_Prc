package com.dailycode.MultiThreadings.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
      SharedResource sharedResource=new SharedResource();
        ReadWriteLock lock=new ReentrantReadWriteLock();
      Thread t1=new Thread(()->sharedResource.producer(lock));
        Thread t2=new Thread(()->sharedResource.producer(lock));
        SharedResource resource2=new SharedResource();
        Thread t3=new Thread(()->sharedResource.consumer(lock));

        t1.start();
        t2.start();
        t3.start();
    }
}
