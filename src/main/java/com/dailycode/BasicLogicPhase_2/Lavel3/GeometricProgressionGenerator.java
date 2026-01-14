package com.dailycode.BasicLogicPhase_2.Lavel3;

import java.util.Scanner;

public class GeometricProgressionGenerator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int FirstTerm=in.nextInt();
        int secondTerm=in.nextInt();
        int ratio=secondTerm/FirstTerm;
         int n=in.nextInt();
         for(int i=0;i<n;i++){
             int term=FirstTerm*(int)Math.pow(ratio,i);
             System.out.println(term);
         }
    }
}
