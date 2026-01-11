package com.dailycode.BasicLogiPhase_1.Lavel5;

import java.util.Scanner;

public class GeometricProgressionChecker {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if(b*b ==a*c){
            System.out.println("GP");
        }else{
            System.out.println("Not A GP");

        }
    }
}

