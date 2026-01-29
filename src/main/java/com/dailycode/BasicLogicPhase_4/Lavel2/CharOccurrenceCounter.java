package com.dailycode.BasicLogicPhase_4.Lavel2;

public class CharOccurrenceCounter {
    public static void main(String[] args) {
     String str="hello";
       char target='l';
       int count=0;
       for(char ch: str.toCharArray()){
           if(ch==target){
               count++;
           }
       }
        System.out.println(count);
    }
}
