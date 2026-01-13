package com.dailycode.BasicLogicPhase_2.Lavel2;

import java.util.Scanner;

public class PrimeRangePrinter {
    public static void main(String[] args) {
      int lowerBound=1;
      int upperBound=100;
        for(int num=lowerBound; num<=upperBound; num++){
            boolean isPrime = num >= 2;  // Prime only if >= 2
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num);
            }
        }

    }
}
