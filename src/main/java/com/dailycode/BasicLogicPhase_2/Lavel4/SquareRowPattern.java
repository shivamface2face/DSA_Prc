package com.dailycode.BasicLogicPhase_2.Lavel4;

import java.util.Scanner;

public class SquareRowPattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i*i+" ");
            }
            System.out.println();
        }
    }
}
