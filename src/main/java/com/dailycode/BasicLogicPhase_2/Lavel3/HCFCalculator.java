package com.dailycode.BasicLogicPhase_2.Lavel3;

import java.util.Scanner;

public class HCFCalculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int res=Math.min(n,m);
        while (res>0){
            if(n%res==0 && m%res==0){
                break;
            }
            res--;
        }
        System.out.println(res);
    }
}
