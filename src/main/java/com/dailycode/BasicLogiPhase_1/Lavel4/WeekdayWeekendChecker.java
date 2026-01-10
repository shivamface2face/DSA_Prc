package com.dailycode.BasicLogiPhase_1.Lavel4;

import java.util.Scanner;

public class WeekdayWeekendChecker {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int  day=in.nextInt();
        if(day < 1 || day > 7) {
            System.out.println("Invalid input! Please enter a number between 1 and 7.");
        } else if(day>=1 && day<=5){
            System.out.println("weekday");
        }else {
            System.out.println("weekend");
        }
    }
}

