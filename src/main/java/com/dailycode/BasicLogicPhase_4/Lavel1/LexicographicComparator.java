package com.dailycode.BasicLogicPhase_4.Lavel1;

public class LexicographicComparator {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println();
        int res=str1.compareTo(str2);
        if(res==0){
            System.out.println("both are qual");
        }else if (res>1){
            System.out.println(str1 + " comes after " + str2);
        }else {
            System.out.println(str1 + " comes before " + str2);
        }
    }
}
