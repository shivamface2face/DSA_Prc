package com.dailycode.BasicLogicPhase_2.Lavel2;

import java.util.Scanner;

public class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int sum=0;
        int tem=num;
        while (tem>0){
            int dig=tem%10;
            sum=sum+(dig*dig*dig);
            tem=tem/10;
        }
        if(sum==num){
            System.out.println("its a armstrong number");
        }else {
            System.out.println("not a armstrong number");
        }
    }
}
