package com.dailycode.BasicLogicPhase_2.Lavel4;

import java.util.Scanner;

public class MinMaxDigitFinder {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int min=9;
        int max=0;
        while (n>0){
            int dig=n%10;
            if (dig>max){
                max=dig;
            }
            if(dig<min){
                min=dig;
            }
            n=n/10;
        }
        System.out.println(max+" "+min);
    }
}
