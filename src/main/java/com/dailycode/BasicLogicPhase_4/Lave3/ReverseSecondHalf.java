package com.dailycode.BasicLogicPhase_4.Lave3;

public class ReverseSecondHalf {
    public static void main(String[] args) {
         String string = "abcdefgh";
         int len=string.length();
         String res="";
         for(int i=len-1;i>=len/2;i--){
             res+=string.charAt(i);
         }
        System.out.println(res);

         String firstHalf=string.substring(0,len/2);
         String secondHalf=string.substring(len/2);
         String rev=new StringBuilder(secondHalf).reverse().toString();
        String ress=firstHalf+rev;
        System.out.println(ress);
    }
}
