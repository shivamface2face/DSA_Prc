package com.dailycode.BasicLogiPhase_1.Lavel4;

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int units=in.nextInt();
        int charge=in.nextInt();
        if (units>100){
            int bill=units*charge;
            System.out.println("bill "+ bill);
        }else{
            System.out.println("no bill");
        }
    }
}

