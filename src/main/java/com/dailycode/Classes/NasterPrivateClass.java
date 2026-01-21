package com.dailycode.Classes;

public class NasterPrivateClass {
    public static void main(String[] args) {
        OuterCLasses outerCLasses=new OuterCLasses();
        outerCLasses.display();;
    }
}
class OuterCLasses {
    int instanceVariable=12;
    static int classVariable=13;
    private static class NastedClass{
        public void print(){
            System.out.println(classVariable);
        }
    }
    public void display(){
        NastedClass nest=new NastedClass();
        nest.print();
    }
}

