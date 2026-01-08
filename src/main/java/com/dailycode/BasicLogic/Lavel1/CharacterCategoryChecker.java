package com.dailycode.BasicLogic.Lavel1;

import java.util.Scanner;

public class CharacterCategoryChecker {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       char ch=in.next().charAt(0);
       if(Character.isUpperCase(ch)){
           System.out.println("UpperCase");
       }else if(Character.isLowerCase(ch)){
           System.out.println("LowerCase");
       }else if (Character.isDigit(ch)){
           System.out.println("Digit");
       }else {
           System.out.println("special character");
       }
    }
}
