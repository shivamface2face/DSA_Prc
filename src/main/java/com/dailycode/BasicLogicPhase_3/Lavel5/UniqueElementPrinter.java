package com.dailycode.BasicLogicPhase_3.Lavel5;

import java.util.HashSet;
import java.util.Set;

public class UniqueElementPrinter {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 5, 16, 3, 8, 12, 9};
//        Set<Integer>integerSet=new HashSet<>();
//        for (int i = 0; i <arr.length ; i++) {
//            integerSet.add(arr[i]);
//        }
//        System.out.println(integerSet);

        int len=arr.length;
        for (int i=0;i< arr.length;i++){
            int count=0;
            for (int j = 0; j < len; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
            }
        }
    }

}
