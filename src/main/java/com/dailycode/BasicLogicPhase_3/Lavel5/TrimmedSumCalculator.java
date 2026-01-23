package com.dailycode.BasicLogicPhase_3.Lavel5;

public class TrimmedSumCalculator {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 5, 16, 3, 8, 12, 9};
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum-(min+max));
    }
}
