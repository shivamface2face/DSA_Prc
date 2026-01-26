package com.dailycode.BasicLogicPhase_4.Lavel2;

public class WordsEndingWithS {
    public static void main(String[] args) {
        String[] words={"cats","dos","sun","mars"};
         int count=0;
         for(String word:words){
             if(word.endsWith("s")){
                 count++;
             }
         }
        System.out.println(count);
    }
}
