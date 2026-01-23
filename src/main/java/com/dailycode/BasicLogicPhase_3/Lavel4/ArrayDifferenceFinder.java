package com.dailycode.BasicLogicPhase_3.Lavel4;

public class ArrayDifferenceFinder {
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 8, 3, 9, 1, 8, 7};
        int[] arr2 = {3, 8, 6, 9, 3, 2, 4, 5};
        for (int i=0;i<arr1.length;i++){
            boolean found=false;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println(arr1[i]+" ");
            }
        }

        System.out.println("\n\nElements in arr2 but NOT in arr1:");


        for (int i=0;i<arr2.length;i++){
            boolean found=false;
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println(arr2[i]+" ");
            }
        }


    }
}
