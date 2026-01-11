package com.dailycode.BasicLogiPhase_1.Lavel5;

import java.util.Scanner;

public class AxisOriginChecker {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        if(x>0 && y==0 || x<0 && y==0){
            System.out.println("X axis");
        }else if(y>0 && x==0 || y<0 && x==0){
            System.out.println("Y axis");
        }else {
            System.out.println("origin");
        }
    }
}

