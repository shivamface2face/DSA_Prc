package com.dailycode.BasicLogicPhase_4.Lavel2;

public class SpaceCounter {
    public static void main(String[] args) {
    String str="Count the number of spaces in the given string";
    int count=0;
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)==' '){
//                 count++;
//             }
//         }
        for(char ch:str.toCharArray()){
            if (ch==' '){
                count++;
            }
        }

        long c=str.chars().filter(ch->ch==' ').count();
        System.out.println(c);
        System.out.println(count);
    }
}
