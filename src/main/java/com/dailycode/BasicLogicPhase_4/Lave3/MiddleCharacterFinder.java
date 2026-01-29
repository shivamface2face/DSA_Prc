package com.dailycode.BasicLogicPhase_4.Lave3;

public class MiddleCharacterFinder {
    public static void main(String[] args) {
        String string = "testing";
        int len=string.length();
        if(len%2==0){
            char ch1=string.charAt(len/2);
            char ch2=string.charAt((len/2)-1);
            System.out.println(ch2+ ch1+" are the middle characters");

        }else {
            char ch=string.charAt(len/2);
            System.out.println(ch+" is the middle character");

        }
    }
}
