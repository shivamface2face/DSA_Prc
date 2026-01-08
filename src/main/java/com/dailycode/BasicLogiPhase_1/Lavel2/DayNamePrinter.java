package com.dailycode.BasicLogiPhase_1.Lavel2;

import java.util.Scanner;

public class DayNamePrinter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n==1){
            System.out.println("monday");
        } else if (n==2) {
            System.out.println("tuesday");
        } else if (n==3) {
            System.out.println("wednsday");
        } else if (n==4) {
            System.out.println("thursday");
        } else if (n==5) {
            System.out.println("friday");
        } else if (n==6) {
            System.out.println("saturday");
        }else {
            System.out.println("sunday");
        }
    }
}