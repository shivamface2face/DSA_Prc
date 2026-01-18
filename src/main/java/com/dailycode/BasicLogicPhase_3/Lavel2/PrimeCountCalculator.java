package com.dailycode.BasicLogicPhase_3.Lavel2;

public class PrimeCountCalculator {
    public static void main(String[] args) {
        int[] arr = {4, 9, 15, 4, 25, 6, 15, 7, 16, 9, 30};
        int primeCount=0;
        for (int i=0;i< arr.length;i++){
            if (isPrime(arr[i])){
                primeCount++;
            }

        }
        System.out.println(primeCount);
    }

    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
