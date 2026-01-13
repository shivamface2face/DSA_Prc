package com.dailycode.BasicLogicPhase_2.Lavel2;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int rev=0;
        int temp=num;
        while (temp>0){
            int dig=temp%10;
            rev=rev*10+dig;
            temp=temp/10;
        }
        if (rev==num){
            System.out.println("its a palindrome");
        }else {
            System.out.println("not a palindrome");
        }
    }
}
