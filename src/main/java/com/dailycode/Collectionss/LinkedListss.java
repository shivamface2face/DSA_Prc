package com.dailycode.Collectionss;
import java.util.*;
public class LinkedListss {
    public static void main(String[] args) {
        LinkedList<Integer>link=new LinkedList<>();
        link.addLast(90);
        link.addLast(78);
        link.addFirst(67);
        System.out.println(link.getFirst());

        link.add(1,56);
        link.add(3,69);
        System.out.println(link.get(3));
    }
}
