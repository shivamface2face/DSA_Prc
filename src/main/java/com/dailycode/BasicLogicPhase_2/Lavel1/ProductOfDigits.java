package com.dailycode.BasicLogicPhase_2.Lavel1;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n=123;
        int prd=1;
        while (n>0){
            int dig=n%10;
            prd=prd*dig;
            n=n/10;
        }
        System.out.println(prd);
    }
}
