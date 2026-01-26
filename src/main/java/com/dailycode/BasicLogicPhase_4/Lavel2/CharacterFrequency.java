package com.dailycode.BasicLogicPhase_4.Lavel2;
public class CharacterFrequency {
    public static void main(String[] args) {
       String str = "Progamming";
        str = str.toLowerCase();
       int Frequency[]=new int[26];
       for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(ch>='a' && ch<='z'){
               int index = ch - 'a';
               Frequency[index]++;
           }
       }
        System.out.println("Character frequencies:\n");
       for(int i=0;i<26;i++){
           if(Frequency[i]>0){
               char ch=(char) (i+'a');
               System.out.println(ch+" :"+Frequency[i]);
           }
       }
    }
}
