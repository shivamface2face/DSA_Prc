package com.dailycode.Classes;

public class LocalInnerClass {
    public static void main(String[] args) {
        OuterClass outerObj=new OuterClass();
        OuterClass.Innner2 inner2= outerObj.new Innner2();

        inner2.display();
    }
}
class OuterClass{
    int instanceVariable=12;
    static int  classVariable=13;
    class Inner1{
        int inner1=45;
    }
    class Innner2 extends Inner1{
        int innerClass=3;
        void display(){
            System.out.println(instanceVariable+" "+inner1+" "+instanceVariable+" "+classVariable);
        }

    }
}
