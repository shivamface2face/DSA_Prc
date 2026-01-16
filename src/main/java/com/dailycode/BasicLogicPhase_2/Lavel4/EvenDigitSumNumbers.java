package com.dailycode.BasicLogicPhase_2.Lavel4;

public class EvenDigitSumNumbers {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <=100; i++) {
            int lastDigit=i%10;
            int mid=(i/10)%10;
            int digitSum = lastDigit + mid;
            if (digitSum%2==0){
                System.out.println(i);
            }
        }

    }
}
