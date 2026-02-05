package com.dailycode.MultiThreadings.MonitorLock;

public class MonitorLockExample {
  public synchronized void task1(){
      try {
          System.out.println("inside task 1");
          Thread.sleep(1000);
      }catch (Exception e){

      }
  }
  public void task2(){
      System.out.println("inside task 2 before synchronized block ");
      synchronized (this){
          System.out.println("inside task 2  synchronized block");
      }
  }
  public void task3(){
      System.out.println("task 3");
  }
}
