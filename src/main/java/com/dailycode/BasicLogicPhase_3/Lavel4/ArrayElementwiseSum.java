package com.dailycode.BasicLogicPhase_3.Lavel4;

import java.util.Arrays;

public class ArrayElementwiseSum {
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 8, 3, 9, 1, 8, 7};
        int[] arr2 = {3, 8, 6, 9, 3, 2, 4, 5};
        int sumArray[]=new int[arr1.length];
        for (int i = 0; i <arr1.length ; i++) {
            sumArray[i]=arr1[i]+arr2[i];
        }
        System.out.println(Arrays.toString(sumArray));
    }
}
