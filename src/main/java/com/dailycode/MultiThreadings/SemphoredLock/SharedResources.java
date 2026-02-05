package com.dailycode.MultiThreadings.SemphoredLock;

import java.util.concurrent.Semaphore;

public class SharedResources {
    boolean isAvailable=false;
    Semaphore lock=new Semaphore(2);
    public void producer(){
        try {
            lock.acquire();
            System.out.println(" Lock acquired by producer:"+Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(4000);
        }catch (Exception e){

        }
        finally {
            lock.release();
            System.out.println("lock got relaesed by producer: "+Thread.currentThread().getName());
        }
    }
}
