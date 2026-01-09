package com.dailycode.BasicLogiPhase_1.Lavel3;

public class CurrencyNoteDivider {
    public static void main(String[] args) {
        int num=10000;
        if(num>0 && num%100==0 && num%500==0 && num%2000==0){
            System.out.println("note can be divided");
        }else {
            System.out.println("not cab not be breakable");
        }
    }
}

