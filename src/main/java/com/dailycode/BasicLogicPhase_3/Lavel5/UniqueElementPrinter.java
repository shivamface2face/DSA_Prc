package com.dailycode.BasicLogicPhase_3.Lavel5;

import java.util.HashSet;
import java.util.Set;

public class UniqueElementPrinter {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 5, 16, 3, 8, 12, 9};
        Set<Integer>integerSet=new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            integerSet.add(arr[i]);
        }
        System.out.println(integerSet);
    }
}
