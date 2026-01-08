package com.dailycode.Math;

public class Factorials {

    public static void main(String[] args) {
        int n=6;
    int res=1;

        for(int i=2; i<=n;i++){
            res=res*i;
        }
        System.out.println(res);
    }
}
