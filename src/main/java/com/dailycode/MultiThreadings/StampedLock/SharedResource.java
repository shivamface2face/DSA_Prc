package com.dailycode.MultiThreadings.StampedLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    boolean isAvailable=false;
    StampedLock lock = new StampedLock();

    public void producer(){
        long stamp=lock.readLock();
        try {
            System.out.println("read lock acquired by producer: "+Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(2000);
        }catch (Exception e){

        }finally {
            lock.unlockRead(stamp);
            System.out.println("read lock released by producer: "+Thread.currentThread().getName());
        }
    }
    public void consumer(){
        Long stamp=lock.writeLock();
        try {
            System.out.println("write lock acquired by consumer: "+Thread.currentThread().getName());
            isAvailable=false;
        }catch (Exception e){

        }finally {
            lock.unlockWrite(stamp);
            System.out.println("write lock released by consumer: "+Thread.currentThread().getName());
        }
    }
}
