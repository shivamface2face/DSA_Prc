package com.dailycode.Classes;

public class ConcreateClass {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Person p=new Person(10);
        System.out.println(p.getVal());
    }

}

interface Shape {
    public void computeArea();
}

class Person implements Shape{
    int val;
    Person(int val){
        this.val=val;
    }
    public int getVal(){
        return val;
    }

    @Override
    public void computeArea(){
        System.out.println("interface");
    }
}
