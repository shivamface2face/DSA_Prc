package com.dailycode.BasicLogicPhase_3.Lavel1;

public class MinIndexFinder {
    public static void main(String[] args) {
        int arr[]={12,23,34,45,56,67};
        int min=arr[0];
        int index=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                index=i;
            }
        }
        System.out.println(index);
    }
}
