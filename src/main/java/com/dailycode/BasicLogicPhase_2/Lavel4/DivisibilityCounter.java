package com.dailycode.BasicLogicPhase_2.Lavel4;

public class DivisibilityCounter {
    public static void main(String[] args) {
     int c=0;
     for(int i=1;i<=500;i++){
         if(i%7==0 && i%5!=0){
             c++;
         }
     }
        System.out.println(c);
    }
}
