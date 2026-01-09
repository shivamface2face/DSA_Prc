package com.dailycode.BasicLogiPhase_1.Lavel3;

public class FirstLastDigitChecker {
    public static void main(String[] args) {
        int num=1223;
        int absNum = Math.abs(num);
        int lastDigit=absNum%10;
        int third=(absNum/100)%10;
        int second=(absNum/10)%10;
        int firstDigit=absNum/1000;

        if(firstDigit==lastDigit){
            System.out.println("first and last are same");
        }else {
            System.out.println("both are diff");
        }
    }
}

