package com.dailycode.BasicLogicPhase_3.Lavel2;

public class PerfectSquareCounter {
    public static void main(String[] args) {
        int[] arr = {4, 9, 15, 4, 25, 6, 15, 7, 16, 9, 30};
        int perfectSquareCount=0;
        for(int i=0;i<arr.length;i++){
            int sqrt=(int)Math.sqrt(arr[i]);
            if(sqrt*sqrt==arr[i]){
                perfectSquareCount++;
            }
        }
        System.out.println(perfectSquareCount);
    }
}
