package com.dailycode.BasicLogicPhase_2.Lavel2;

import java.util.Scanner;

public class NumberReverser {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int rev=0;
        while (num>0){
            int dig=num%10;
            rev=rev*10+dig;
            num=num/10;
        }
        System.out.println(rev);
    }
}
