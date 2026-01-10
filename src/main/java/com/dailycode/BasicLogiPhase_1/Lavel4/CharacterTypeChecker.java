package com.dailycode.BasicLogiPhase_1.Lavel4;

import java.util.Scanner;

public class CharacterTypeChecker {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char ch=in.next().charAt(0);
        if(Character.isDigit(ch)){
            System.out.println("Digit");
        } else if (Character.isLetter(ch)) {
            System.out.println("Letter");
        }else {
            System.out.println("neither.");
        }
    }
}

