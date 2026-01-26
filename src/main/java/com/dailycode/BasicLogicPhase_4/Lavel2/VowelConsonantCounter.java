package com.dailycode.BasicLogicPhase_4.Lavel2;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        String srt="Hello World";
        int vowelCount=0;
        int consonantCount=0;
        for(int i=0;i<srt.length();i++){
            char ch=srt.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                ch=Character.toLowerCase(ch);
                if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowelCount++;
                }else {
                    consonantCount++;
                }
            }
        }
        System.out.println("vowel count :"+vowelCount);
        System.out.println("consonant count :"+consonantCount);
    }
}
