package com.dailycode.BasicLogicPhase_2.Lavel4;

import java.util.Scanner;

public class OddEvenDigitSumSeparator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int evnSum=0;
        int oddSum=0;
        while (n>0){
            int dig=n%10;
            if(dig%2==0){
                evnSum+=dig;
            }else {
                oddSum+=dig;
            }
            n=n/10;
        }
        System.out.println("even dig sum: "+evnSum);
        System.out.println("odd dig sum: "+oddSum);
    }
}
