package com.dailycode.BasicLogiPhase_1.Lavel2;

public class OddEvenComparator {
    public static void main(String[] args) {
       int n=1;
       int m=1;
       if(n%2==0 && m%2==0){
           System.out.println("both are even");
       } else if (n%2==0 && m%2!=0) {
           System.out.println("only n is even");
       } else if (n%2!=0 && m%2==0) {
           System.out.println("only m is even");
       }else{
           System.out.println("both are odd no");
       }
    }
}

