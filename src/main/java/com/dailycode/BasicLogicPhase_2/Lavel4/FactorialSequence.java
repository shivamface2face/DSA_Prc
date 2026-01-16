package com.dailycode.BasicLogicPhase_2.Lavel4;

public class FactorialSequence {
    public static void main(String[] args) {

       int n=10;
        for (int i = 1; i <=n; i++) {
            int fact = 1;  // Reset factorial for each number

            for (int j = 1; j <= i; j++) {
                fact = fact * j;
            }

            System.out.println("Factorial of " + i + " = " + fact);
        }
    }
}
