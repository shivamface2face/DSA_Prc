package com.dailycode.BasicLogicPhase_2.Lavel2;

import java.util.Scanner;

public class FibonacciSumCalculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        if(num<=0){
            return;
        }
        int a=0;
        int b=1;
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+a;
            int next=a+b;
            a=b;
            b=next;
        }
        System.out.println(sum);
    }

}
