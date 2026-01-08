package com.dailycode.BasicLogiPhase_1.Lavel2;

import java.util.Scanner;

public class DayGreeter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int hr= in.nextInt();
        if(hr>0 && hr<12){
            System.out.println("good morning");
        } else if (hr>=12 && hr<16) {
            System.out.println("good afternoon");
        } else if (hr>=16 && hr<21) {
            System.out.println("good evening");
        }else{
            System.out.println("good night");
        }
    }
}

