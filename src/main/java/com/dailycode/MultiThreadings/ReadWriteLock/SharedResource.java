package com.dailycode.MultiThreadings.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    boolean isAvaliable=false;
    public void producer(ReadWriteLock lock){
        try {
            lock.readLock().lock();
            System.out.println("read lock acquired by producer"+Thread.currentThread().getName());
            isAvaliable=true;
            Thread.sleep(8000);
        }catch (Exception e){

        }finally {
            lock.readLock().unlock();
            System.out.println("read lock released by producer: "+Thread.currentThread().getName());
        }
    }

    public void consumer(ReadWriteLock lock){
        try {
            lock.writeLock().lock();
            System.out.println("write lock acquired by consumer: "+Thread.currentThread().getName());
        }catch (Exception e){

        }finally {
            lock.writeLock().unlock();
            System.out.println("Write lock ");
        }
    }
}
