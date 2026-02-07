package com.dailycode.MultiThreadings.ThreadPoolExcucutor;

import java.util.concurrent.*;

public class ThreadPoolMain {
    public static void main(String[] args) {
        try (ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10), new CustomThreadFactory(), new CustomThreadPoolExecutor())) {
            // Submit tasks here if needed

            poolExecutor.allowCoreThreadTimeOut(true);
            for (int i = 0; i < 25; i++) {
                poolExecutor.submit(()->{
                    try {
                        Thread.sleep(3000);
                        System.out.println("thread name is: "+Thread.currentThread().getName());

                    } catch (Exception e) {

                    }
                });
                
            }
            System.out.println("ThreadPool created successfully");
        }
    }
}

class CustomThreadPoolExecutor implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("task rejected: "+r.toString());
    }
}

class CustomThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r);
    }
}