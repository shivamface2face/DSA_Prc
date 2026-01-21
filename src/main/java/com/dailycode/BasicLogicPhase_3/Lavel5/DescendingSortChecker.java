package com.dailycode.BasicLogicPhase_3.Lavel5;

public class DescendingSortChecker {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 5, 16, 3, 8, 12, 9};
        boolean isDescendingFlag=true;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>arr[i+1]){
                isDescendingFlag=false;
                break;
            }
        }
        if(isDescendingFlag==true){
            System.out.println("in desc order");
        }else{
            System.out.println("not in asc order");
        }
    }
}
