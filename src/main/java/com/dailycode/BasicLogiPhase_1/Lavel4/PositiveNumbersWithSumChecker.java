package com.dailycode.BasicLogiPhase_1.Lavel4;

import java.util.Scanner;

public class PositiveNumbersWithSumChecker {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        int b=in.nextInt();
        if(a>0 && b>0 && (a+b)<100){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}

