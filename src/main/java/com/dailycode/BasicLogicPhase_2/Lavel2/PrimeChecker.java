package com.dailycode.BasicLogicPhase_2.Lavel2;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        boolean isPrime=true;

        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime==true && num>1){
            System.out.println("its a prime number");
        }else {
            System.out.println("its not a prime number");
        }
    }
}
