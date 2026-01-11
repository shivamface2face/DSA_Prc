package com.dailycode.BasicLogiPhase_1.Lavel5;

import java.util.Scanner;

public class PythagoreanTripletChecker {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        if( (a*a+b*b==c*c) || (b*b+c*c==a*a) || (c*c+a*a==b*b)){
            System.out.println("its a pythagorean triplet");
        }else {
            System.out.println("its not a pythagorean triplet");
        }
    }
}

