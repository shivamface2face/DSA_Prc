package com.dailycode.BasicLogicPhase_3.Lavel4;

public class CommonElementFinder {
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 8, 3, 9, 1, 8, 7};
        int[] arr2 = {3, 8, 6, 9, 3, 2, 4, 5};
        int commonElement=-1;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                if (arr1[i]==arr2[j]){
                    commonElement=arr1[i];
                    break;
                }
            }
            if(commonElement!=-1){
                break;
            }
        }
        System.out.println(commonElement);
    }
}
