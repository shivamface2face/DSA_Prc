package com.dailycode.BasicLogicPhase_4.Lavel1;

import java.util.Locale;

public class UpperCaseConverter {
    public static void main(String[] args) {
        String testString = "Hello World Java";
        System.out.println(testString.toUpperCase(Locale.of("en")));
    }
}
