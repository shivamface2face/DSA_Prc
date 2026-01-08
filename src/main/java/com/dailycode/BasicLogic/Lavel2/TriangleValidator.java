package com.dailycode.BasicLogic.Lavel2;

public class TriangleValidator {
    public static void main(String[] args) {
     int a=12;
     int b=11;
     int c=15;
     if(a+b>c){
         System.out.println("its valid triangle");
     }else if(b+c>a){
         System.out.println("its a valid triangle");
     }else if (a+c>b){
         System.out.println("its valid triangle");
     }else {
         System.out.println("not a valid triangle");
     }
    }
}

