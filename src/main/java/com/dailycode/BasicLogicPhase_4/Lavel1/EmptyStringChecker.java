package com.dailycode.BasicLogicPhase_4.Lavel1;

public class EmptyStringChecker {
    public static void main(String[] args) {
        String testString = "Hello World Java";
        int leng=testString.length();
        if(leng==0){
            System.out.println("String is empty");
        }else{
            System.out.println("String is not empty");
        }
    }
}
