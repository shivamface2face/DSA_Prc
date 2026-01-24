package com.dailycode.BasicLogicPhase_3.Lavel4;

public class DuplicateElementPrinter {
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 8, 3, 9, 1, 8, 7};
        int[] arr2 = {3, 8, 6, 9, 3, 2, 4, 5};
        for (int i = 0; i < arr1.length; i++) {
            boolean alreadyPrinted = false;
            for (int j = 0; j <i; j++) {
                if (arr1[j]==arr1[i]){
                   alreadyPrinted=true;
                    break;
                }
            }
            if (!alreadyPrinted){
                for (int k = 0; k < arr2.length; k++) {
                    if (arr1[i] == arr2[k]) {
                        System.out.print(arr1[i] + " ");
                        break;
                    }
                }
            }
        }
    }
}
