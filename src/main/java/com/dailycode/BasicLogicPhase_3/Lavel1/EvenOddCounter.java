package com.dailycode.BasicLogicPhase_3.Lavel1;

public class EvenOddCounter {
    public static void main(String[] args) {
        int arr[]={12,23,34,45,56,67,22};
        int oddCount=0;
        int evenCount=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println(evenCount+" "+oddCount);
    }
}
