package com.dailycode.BasicLogicPhase_3.Lavel1;

public class ElementFilter {
    public static void main(String[] args) {
        int arr[]={12,23,34,45,56,67,22};
        int k=22;
        int count=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>k){
                count++;
            }
        }
        System.out.println(count);
    }
}
