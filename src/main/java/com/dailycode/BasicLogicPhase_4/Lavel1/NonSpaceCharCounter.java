package com.dailycode.BasicLogicPhase_4.Lavel1;

public class NonSpaceCharCounter {
    public static void main(String[] args) {
        String testString = "Hello World Java";
        int count=0;
        for (int i=0;i<testString.length();i++){
            if(testString.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
