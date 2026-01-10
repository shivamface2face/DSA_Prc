package com.dailycode.BasicLogiPhase_1.Lavel4;

import java.util.Scanner;

public class TimeAMPMChecker {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int hr=in.nextInt();
        int min=in.nextInt();
        int totalMin=hr*60+min;
        if(totalMin>=720){
            System.out.println("PM");
        }else {
            System.out.println("AM");
        }
    }
}

