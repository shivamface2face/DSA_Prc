package com.dailycode.BasicLogic.Lavel2;

public class MultipleChecker {
    public static void main(String[] args) {
       int n=90;
       int m=15;
       if(n>m && n%m==0){
           System.out.println("its multiple");
       } else if (m>n && m%n==0) {
           System.out.println("its multiple");
       }else {
           System.out.println("its not a multiple");
       }
    }
}

