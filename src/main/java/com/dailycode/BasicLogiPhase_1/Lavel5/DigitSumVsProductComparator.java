package com.dailycode.BasicLogiPhase_1.Lavel5;

import java.util.Scanner;

public class DigitSumVsProductComparator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();

        if (num < 1 || num > 9999) {
            System.out.println("Invalid input");
            return;
        }

        int sum=0;
        int prd=1;

        int temp=num;
        while (temp>0){
            int di=temp%10;
            sum=sum+di;
            prd=prd*di;
            temp/=10;
        }
        if(sum>prd){
            System.out.println("sum is grater");
        }else if(prd>sum){
            System.out.println("product is grater");
        }else{
            System.out.println("both are equal");
        }

    }
}

