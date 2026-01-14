package com.dailycode.BasicLogicPhase_2.Lavel3;

import java.util.Scanner;

public class ArithmeticProgressionGenerator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int FirstTerm=in.nextInt();
        int secondTerm=in.nextInt();
        int diff=secondTerm-FirstTerm;
        int n=in.nextInt();
        for(int i=0;i<=n;i++){
            int term=FirstTerm+i*diff;
            System.out.println(term);
        }
    }
}
