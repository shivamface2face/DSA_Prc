package com.dailycode.BasicLogicPhase_3.Lavel3;

public class SquareArrayGenerator {
    public static void main(String[] args) {
        int[] arr = {12, -5, 8, -3, 7, 4, -9, 6, 15, 2};
        int sqrArr[]=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            sqrArr[i]=arr[i]*arr[i];
        }
        for (int arr1:sqrArr){
            System.out.println(arr1);
        }
    }
}
