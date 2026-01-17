package com.dailycode.BasicLogicPhase_3.Lavel1;

public class ArrayMaximum {
    public static void main(String[] args) {
        int arr[]={12,23,34,45,56,67};
        int mmax=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>mmax){
                mmax=arr[i];
            }
        }
        System.out.println(mmax);
    }
}
