package com.dailycode.BasicLogicPhase_3.Lavel4;

public class ArrayEqualityChecker {
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 8, 3, 9, 1, 8, 7};
        int[] arr2 = {3, 8, 6, 9, 3, 2, 4, 5};
        boolean isEqual=true;

        if(arr1.length!= arr2.length){
            isEqual=false;
        }
        else{
            for (int i = 0; i < arr1.length ; i++) {
                if(arr1[i]!=arr2[i]){
                    isEqual=false;
                    break;
                }
            }
        }
        System.out.println(isEqual);
    }
}
