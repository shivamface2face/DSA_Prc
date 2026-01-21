package com.dailycode.BasicLogicPhase_3.Lavel3;

import java.util.Arrays;

public class ArrayCopier {
    public static void main(String[] args) {
        int[] arr = {12, -5, 8, -3, 7, 4, -9, 6, 15, 2};
        int[] copArray=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copArray[i]= arr[i];
        }
        System.out.println(Arrays.toString(copArray));
    }
}
