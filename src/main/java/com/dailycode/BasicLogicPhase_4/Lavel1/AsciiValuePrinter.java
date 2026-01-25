package com.dailycode.BasicLogicPhase_4.Lavel1;

public class AsciiValuePrinter {
    public static void main(String[] args) {
        String testString = "Hello World Java";
        for (int i = 0; i < testString.length()-1; i++) {
            Character character = testString.charAt(i);
            int asciiValue=(int)character;
            System.out.println("the ascii value of "+character+" is :"+asciiValue);
        }
    }
}
