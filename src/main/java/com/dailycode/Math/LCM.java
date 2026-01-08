package com.dailycode.Math;

public class LCM {
    public static void main(String[] args) {
        int n=4;
        int m=6;
        int res=Math.min(n,m);
        while (res>0){
            if(res%n==0 && res%m==0){
                break;
            }
            res--;
        }
        System.out.println(res);
    }
}
