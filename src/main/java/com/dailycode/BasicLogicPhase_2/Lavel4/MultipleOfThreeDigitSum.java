package com.dailycode.BasicLogicPhase_2.Lavel4;

public class MultipleOfThreeDigitSum {
    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++){
            int temp = i;
            int sum = 0;

            // Calculate sum of all digits
            while(temp > 0){
                int digit = temp % 10;
                sum = sum + digit;
                temp = temp / 10;
            }

            // Check if sum is divisible by 3
            if(sum % 3 == 0){
                System.out.println(i);
            }
        }
    }
}