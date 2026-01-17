package com.dailycode.BasicLogicPhase_3.Lavel1;

public class MaxIndexFinder {
    public static void main(String[] args) {
        int arr[]={12,23,34,45,56,67};
        int max=arr[0];
        int index=-1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        System.out.println(index);
    }
}
