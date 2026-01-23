package com.dailycode.BasicLogicPhase_3.Lavel5;

public class SecondSmallestFinder {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 5, 16, 3, 8, 12, 9};
        int samallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<samallest){
                secondSmallest=samallest;
                samallest=arr[i];
            }else if(arr[i]<secondSmallest && arr[i]!=samallest){
                secondSmallest=arr[i];
            }
        }
        System.out.println(secondSmallest);
    }
}
