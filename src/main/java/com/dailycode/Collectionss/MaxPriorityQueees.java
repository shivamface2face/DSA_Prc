package com.dailycode.Collectionss;
import  java.util.*;
public class MaxPriorityQueees {
    public static void main(String[] args) {
        System.out.println("Max proirity queue examples");
        PriorityQueue<Integer>maxPrq=new PriorityQueue<>((Integer a,Integer b)->b-a);
        maxPrq.add(12);
        maxPrq.add(45);
        maxPrq.forEach((Integer val)->System.out.print(val+" "));
        System.out.println();
        while(!maxPrq.isEmpty()){
            int val=maxPrq.poll();
            System.out.print(val+" ");
        }
    }
}
