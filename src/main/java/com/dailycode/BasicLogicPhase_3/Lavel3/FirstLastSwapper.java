package com.dailycode.BasicLogicPhase_3.Lavel3;

import java.util.Arrays;

public class FirstLastSwapper {
    public static void main(String[] args) {
        int[] arr = {12, -5, 8, -3, 7, 4, -9, 6, 15, 2};
        int temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
