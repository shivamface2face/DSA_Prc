package com.dailycode.BasicLogicPhase_3.Lavel2;

public class ElementExistenceChecker {
    public static void main(String[] args) {
        int[] arr = {4, 9, 15, 4, 25, 6, 15, 7, 16, 9, 30};
        int elementToFind=25;
        boolean isExist=false;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==elementToFind){
                isExist=true;
                break;
            }
        }
        if(isExist){
            System.out.println("element found");
        }else{
            System.out.println("elemt not found");
        }
    }
}
