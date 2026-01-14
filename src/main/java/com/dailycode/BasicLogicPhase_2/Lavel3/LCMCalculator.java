package com.dailycode.BasicLogicPhase_2.Lavel3;

import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();

        int res=Math.max(n,m);

        while (res>0){
            if(res%n==0 && res%m==0){
                break;
            }
            res++;
        }
        System.out.println(res);
    }
}
