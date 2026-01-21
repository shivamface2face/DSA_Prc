package com.dailycode.Classes;

public class StaticNestedClassExm {
    public static void main(String[] args) {
        OuterCLass.NastedClass nestedClass=new OuterCLass.NastedClass();
        nestedClass.print();
    }
}


class OuterCLass {
    int instanceVariable=12;
    static int  classVariable=13;
    static class NastedClass{
        public void print(){
//            System.out.println(instanceVariable+classVariable);
        }
    }
}


