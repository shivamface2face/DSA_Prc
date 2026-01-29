package com.dailycode.BasicLogicPhase_4.Lave3;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str ="mam";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("yes its an palindrome");
        }else {
            System.out.println("not an palindrome");
        }
    }
}
