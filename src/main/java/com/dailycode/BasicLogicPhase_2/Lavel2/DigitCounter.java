package com.dailycode.BasicLogicPhase_2.Lavel2;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int count=0;
        while (num>0){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}
