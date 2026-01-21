package com.dailycode.BasicLogicPhase_3.Lavel3;

import java.util.Arrays;

public class RightRotator {
    public static void main(String[] args) {
        int[] arr = {12, -5, 8, -3, 7, 4, -9, 6, 15, 2};
        int n=1;
        rightRoatate(arr,n);
    }
    public static void rightRoatate(int arr[],int n){
        int len=arr.length;
        int roatatedArray[]=new int[len];
        for (int i = 0; i <len ; i++) {
            roatatedArray[i]=arr[(i-n+len)%len];
        }
        System.out.println(Arrays.toString(roatatedArray));
    }
}
