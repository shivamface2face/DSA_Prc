package com.dailycode.BasicLogicPhase_3.Lavel4;

import java.util.Arrays;

public class ArrayMerger {
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 8, 3, 9, 1, 8, 7};
        int[] arr2 = {3, 8, 6, 9, 3, 2, 4, 5};
        int len1= arr1.length;;
        int len2=arr2.length;
        int mergeArray[]=new int[len2+len1];
        for (int i = 0; i < len1; i++) {
            mergeArray[i]=arr1[i];
        }
        for (int i = 0; i < len2; i++) {
            mergeArray[len1+i]=arr2[i];
        }
        System.out.println(Arrays.toString(mergeArray));
    }
}
