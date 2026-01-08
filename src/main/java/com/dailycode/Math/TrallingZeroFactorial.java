package com.dailycode.Math;

public class TrallingZeroFactorial {
    public static void main(String[] args) {
        int n=10;
        int fact=1;
        for (int i=2;i<=n;i++){
            fact=fact*i;
        }
        int res=0;
        while (fact%10==0){
            res++;
            fact/=10;
        }
        System.out.println(res);
    }
}
