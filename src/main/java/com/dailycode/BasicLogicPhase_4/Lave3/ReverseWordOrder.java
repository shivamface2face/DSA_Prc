package com.dailycode.BasicLogicPhase_4.Lave3;

public class ReverseWordOrder {
    public static void main(String[] args) {
        String str ="Hello world from Java";
        String words[]=str.split(" ");
        String rev="";
        for (int i=words.length-1;i>=0;i--) {
            rev=rev+words[i]+" ";
        }
        System.out.println(rev.trim());
    }
}
