package com.dailycode.BasicLogicPhase_4.Lave3;

public class ReverseStringComparator {
    public static void main(String[] args) {
        String str1="mam";
        String str2="mam";
        String rev="";
        for(int i=str2.length()-1;i>=0;i--){
            rev=rev+str2.charAt(i);
        }
        if (rev.equals(str1)){
            System.out.println("yes both are ");

        }else {
            System.out.println("not equal");
        }
    }
}
