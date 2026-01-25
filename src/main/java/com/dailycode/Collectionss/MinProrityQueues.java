package com.dailycode.Collectionss;

import java.util.PriorityQueue;

public class MinProrityQueues {
    public static void main(String[] args) {
        System.out.println("Try min Priority Queue");
        PriorityQueue<Integer> minPrq=new PriorityQueue<>();
        minPrq.add(12);
        minPrq.add(45);
        minPrq.forEach((Integer val)->System.out.println(val));
        while(!minPrq.isEmpty()){
            int val=minPrq.poll();
            System.out.println(val);
        }
    }
}
