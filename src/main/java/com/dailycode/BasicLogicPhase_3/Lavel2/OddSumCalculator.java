package com.dailycode.BasicLogicPhase_3.Lavel2;

public class OddSumCalculator {
    public static void main(String[] args) {
        int[] arr = {4, 9, 15, 4, 25, 6, 15, 7, 16, 9, 30};
        int oddSum=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]%2!=0){
                oddSum+=arr[i];
            }
        }
        System.out.println(oddSum);

    }
}
