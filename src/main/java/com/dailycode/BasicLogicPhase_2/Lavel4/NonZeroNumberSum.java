package com.dailycode.BasicLogicPhase_2.Lavel4;

import java.util.Scanner;

public class NonZeroNumberSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 5 numbers:");
        for (int i = 1; i <= 5; i++) {
            int num = in.nextInt();
            if (num == 0) {
                continue;  // Skip if user enters 0
            }

            sum += num;  // Add to sum only if not 0
        }

        System.out.println("Sum of all non-zero numbers: " + sum);
    }
}