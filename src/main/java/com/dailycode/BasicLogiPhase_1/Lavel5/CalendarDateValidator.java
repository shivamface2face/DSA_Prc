package com.dailycode.BasicLogiPhase_1.Lavel5;

import java.util.Scanner;

public class CalendarDateValidator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int day=in.nextInt();
        int month=in.nextInt();
        boolean isValidDate=false;
        if(month <1 || month>12 || day<1){
            isValidDate=false;
        }else if (month==2){
            if(day<=28){
                isValidDate=true;
            }
        }else if (month==4 || month==6 || month==9 || month==11){
            if(day<=30){
                isValidDate=true;
            }
        }else {
            if (day<=31){
                isValidDate=true;
            }
        }

        if(isValidDate==true){
            System.out.println("valid date");
        }else {
            System.out.println("invalid date");
        }
    }
}

