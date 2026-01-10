package com.dailycode.BasicLogiPhase_1.Lavel4;

import java.util.Scanner;

public class DigitWordForm {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int digit=in.nextInt();
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
         if(digit>=0 && digit<=9){
             System.out.println(words[digit]);
         }else {
             System.out.println("Invalid input");
         }

    }
}

