package com.dailycode.BasicLogiPhase_1.Lavel5;

import java.util.Scanner;

public class DigitSumEqualityChecker {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=Math.abs(n);
        int lastDigit=a%10;
        int mid=(a/10)%10;
        int first=a/100;
        if(mid==lastDigit+first){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}


