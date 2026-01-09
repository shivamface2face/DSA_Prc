package com.dailycode.BasicLogiPhase_1.Lavel3;

public class DistinctDigitsChecker {
    public static void main(String[] args) {
       int num=223;
        int absNum = Math.abs(num);
       int lastDigit=absNum%10;
       int midDigit=(absNum/10)%10;
       int firstDigit=absNum/100;
       if(lastDigit!=midDigit && lastDigit!=firstDigit && firstDigit!=midDigit){
           System.out.println("number has all diffrent digits");
       }else{
           System.out.println("number has same  digits");
       }
    }
}

