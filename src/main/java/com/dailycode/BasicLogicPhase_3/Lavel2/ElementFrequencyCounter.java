package com.dailycode.BasicLogicPhase_3.Lavel2;

public class ElementFrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {4, 9, 15, 4, 25, 6, 15, 7, 16, 9, 30};
        int elementToFind=15;
        int feq=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==elementToFind){
                feq++;
            }
        }
        System.out.println(feq);
    }
}
