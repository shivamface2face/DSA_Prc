package com.dailycode.BasicLogicPhase_3.Lavel3;

public class LeftRotator {
    public static void main(String[] args) {
        int[] arr = {12, -5, 8, -3, 7, 4, -9, 6, 15, 2};
        int n=1;
        leftRotate(arr,n);
    }
    public static void leftRotate(int arr[],int n){
        int len= arr.length;
        int rotatedArray[]=new int[len];
        for(int i=0;i<len;i++){
            rotatedArray[i]=arr[(i+n)%len];
        }
        for (int i = 0; i < len; i++) {
            System.out.println(rotatedArray[i]);
        }
    }
}
