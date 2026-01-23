package com.dailycode.BasicLogicPhase_3.Lavel5;

public class PairSumCounter {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 5, 16, 3, 8, 12, 9};
        int tragetSum=17;
        int count=0;
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==tragetSum){
                    System.out.println(arr[i] + " " + arr[j]);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
