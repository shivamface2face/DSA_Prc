package com.dailycode.BasicLogicPhase_3.Lavel5;

public class AboveAverageCounter {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 5, 16, 3, 8, 12, 9};
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            sum+=arr[i];
        }
        double avg=sum/(double)arr.length;
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>avg){
                count++;
            }
        }
        System.out.println(count);
    }
}
