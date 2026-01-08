package com.dailycode.BasicLogic.Lavel1;

public class LargestOfThree {
    public static void main(String[] args) {
   int n=9;
   int m=18;
   int p=7;
   if(n>m && n>p){
       System.out.println(n +" is the bigger no");
   }else if(m>p && m>n){
       System.out.println(m+ " is the bigger no");
   }else{
       System.out.println(p+ " is the bigger no.");
   }
    }
}
