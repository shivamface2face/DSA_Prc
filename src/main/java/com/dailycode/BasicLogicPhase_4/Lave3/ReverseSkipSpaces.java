package com.dailycode.BasicLogicPhase_4.Lave3;

public class ReverseSkipSpaces {
    public static void main(String[] args) {
        String string = "a b c d e";
        String res="";
        for(int i=string.length()-1;i>=0;i--){
            if(string.charAt(i)!=' '){
                res+=string.charAt(i);
            }
        }
        System.out.println(res);
    }
}
