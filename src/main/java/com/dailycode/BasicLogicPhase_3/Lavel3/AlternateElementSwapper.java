package com.dailycode.BasicLogicPhase_3.Lavel3;

import java.util.Arrays;

public class AlternateElementSwapper {
    public static void main(String[] args) {
        int[] arr = {12, -5, 8, -3, 7, 4, -9, 6, 15, 2};
        swapAlternateElements(arr);
    }
    public static void swapAlternateElements(int arr[]){
        int len= arr.length;
        for(int i=0;i<len-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
