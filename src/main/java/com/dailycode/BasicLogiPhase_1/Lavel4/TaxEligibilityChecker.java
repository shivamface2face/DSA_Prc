package com.dailycode.BasicLogiPhase_1.Lavel4;

import java.util.Scanner;

public class TaxEligibilityChecker {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int inc=in.nextInt();
        int age=in.nextInt();
        if (age > 18 && inc > 500000) {
            System.out.println("you can pay tax");
        }else {
            System.out.println("you cant pay tax");
        }
    }
}

