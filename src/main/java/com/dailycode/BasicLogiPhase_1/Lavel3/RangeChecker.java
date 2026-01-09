package com.dailycode.BasicLogiPhase_1.Lavel3;

import java.util.Scanner;

public class RangeChecker {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n>=0 && n<=9){
            System.out.println("its one digit number");
        } else if (n>9 && n<100) {
            System.out.println("its two digit number");
        }else {
            System.out.println("its multi digit number");
        }
    }
}

