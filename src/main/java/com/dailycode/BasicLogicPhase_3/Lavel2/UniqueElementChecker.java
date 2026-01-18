package com.dailycode.BasicLogicPhase_3.Lavel2;

public class UniqueElementChecker {
    public static void main(String[] args) {
        int[] arr = {4, 9, 15, 4, 25, 6, 15, 7, 16, 9, 30};
        boolean isUnique=false;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    isUnique=true;
                    break;
                }
            }
        }
        if(isUnique==true){
            System.out.println("Not unique");
        }else {
            System.out.println("Umique arrya");
        }
    }
}
