package com.dailycode.BasicLogicPhase_3.Lavel3;

import java.util.Arrays;

public class EvenElementExtractor {
    public static void main(String[] args) {
        int[] arr = {12, -5, 8, -3, 7, 4, -9, 6, 15, 2};
        int evenCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
               evenCount++;
            }
        }
        int evenArr[]=new int[evenCount];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                evenArr[index] = arr[i];  // First: assign value
                index = index + 1;  //Then: increment index

            }
        }
        System.out.println(Arrays.toString(evenArr));
    }
}
