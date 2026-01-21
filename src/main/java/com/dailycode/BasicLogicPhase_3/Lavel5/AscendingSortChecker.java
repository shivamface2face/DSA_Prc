package com.dailycode.BasicLogicPhase_3.Lavel5;

public class AscendingSortChecker {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 5, 16, 3, 8, 12, 9};
        boolean isAscendingFlag=true;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<arr[i+1]){
                isAscendingFlag=false;
                break;
            }
        }
        if(isAscendingFlag==true){
            System.out.println("in asc order");
        }else{
            System.out.println("not in asc order");
        }
    }
}
