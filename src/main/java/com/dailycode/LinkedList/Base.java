package com.dailycode.LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Base {
    Node head=new Node(12);
    Node sec=new Node(23);
    Node third=new Node(45);

    public Base() {
        head.next = sec;
        sec.next = third;
    }


}
