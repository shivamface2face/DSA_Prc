package com.dailycode.Collectionss;
import java.util.*;
public class ArrayDequeese {
    public static void main(String[] args) {
        ArrayDeque<Integer>arDq=new ArrayDeque<>();
        arDq.addLast(34);
        arDq.addLast(89);
        arDq.addLast(56);

        int element=arDq.removeFirst();
        System.out.println(element);

        ArrayDeque<Integer>arDqSt=new ArrayDeque<>();
        arDqSt.addFirst(90);
        arDqSt.addFirst(23);
        arDqSt.addFirst(78);

        int rem=arDqSt.removeFirst();
        System.out.print(rem);
    }
}
