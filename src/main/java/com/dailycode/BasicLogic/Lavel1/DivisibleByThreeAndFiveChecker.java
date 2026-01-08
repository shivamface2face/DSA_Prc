package com.dailycode.BasicLogic.Lavel1;

public class DivisibleByThreeAndFiveChecker {
    public static void main(String[] args) {
        int n=60;
        if(n%3==0 && n%5==0){
            System.out.println("divisible by 3 & 5");
        }else{
            System.out.println("not divisible by 3 & 5");
        }
    }
}
