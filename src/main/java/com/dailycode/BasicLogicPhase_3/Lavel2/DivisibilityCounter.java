package com.dailycode.BasicLogicPhase_3.Lavel2;

public class DivisibilityCounter {
    public static void main(String[] args) {
        int[] arr = {4, 9, 15, 4, 25, 6, 15, 7, 16, 9, 30};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0 || arr[i]%5==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
