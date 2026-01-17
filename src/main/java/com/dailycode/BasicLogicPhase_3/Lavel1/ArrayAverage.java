package com.dailycode.BasicLogicPhase_3.Lavel1;

public class ArrayAverage {
    public static void main(String[] args) {

        int arr[]={12,23,34,45,56,67};
        int count= arr.length;
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        double avg=sum/count;
        System.out.println(avg);
    }
}
