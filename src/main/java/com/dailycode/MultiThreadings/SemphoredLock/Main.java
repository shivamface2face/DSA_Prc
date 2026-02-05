package com.dailycode.MultiThreadings.SemphoredLock;

public class Main {
    public static void main(String args[]){
         SharedResources resources=new SharedResources();
         Thread t1=new Thread(()->resources.producer());
         Thread t2=new Thread(()->resources.producer());
        Thread t3=new Thread(()->resources.producer());
        Thread t4=new Thread(()->resources.producer());
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
