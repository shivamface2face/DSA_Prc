package com.dailycode.BasicLogicPhase_3.Lavel1;

public class ElementCounter {
    public static void main(String[] args) {
        int arr[]={-1,-4,-6,12,23,34,45,56,67,22};
        int pCount=0;
        int nCount=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>0){
                pCount++;
            } else if (arr[i]<0) {
                nCount++;
            }
        }
        System.out.println(pCount+" "+nCount);

    }
}
