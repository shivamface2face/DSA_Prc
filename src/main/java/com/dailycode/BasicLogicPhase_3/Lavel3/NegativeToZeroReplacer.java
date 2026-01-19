package com.dailycode.BasicLogicPhase_3.Lavel3;

import java.util.Arrays;

public class NegativeToZeroReplacer {
    public static void main(String[] args) {
        int[] arr = {12, -5, 8, -3, 7, 4, -9, 6, 15, 2};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
