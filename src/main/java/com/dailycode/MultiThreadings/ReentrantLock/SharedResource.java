package com.dailycode.MultiThreadings.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable=false;
    ReentrantLock lock=new ReentrantLock();
    public void producer(){
        try {
            lock.lock();
            System.out.println("lock acquired by producer");
            isAvailable=true;
            Thread.sleep(4000);
        }catch (Exception E){

        }finally {
            lock.unlock();
            System.out.println("lock released by producer");
        }
    }
}
