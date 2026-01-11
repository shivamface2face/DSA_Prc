package com.dailycode.BasicLogiPhase_1.Lavel5;

import java.util.Scanner;

public class ArithmeticProgressionChecker {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if((b-a == c-b)){
            System.out.println("Ap");
        }else {
            System.out.println("Not Ap");
        }
    }
}

