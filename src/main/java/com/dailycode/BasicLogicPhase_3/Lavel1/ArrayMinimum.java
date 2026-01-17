package com.dailycode.BasicLogicPhase_3.Lavel1;

public class ArrayMinimum {
    public static void main(String[] args) {
        int arr[]={12,23,34,45,56,67};
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
