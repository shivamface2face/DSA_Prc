package com.dailycode.BasicLogicPhase_3.Lavel5;

public class SecondLargestFinder {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 5, 16, 3, 8, 12, 9};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }

        }
        System.out.println(secondLargest);
    }
}
