package com.dailycode.BasicLogiPhase_1.Lavel1;

import java.util.Scanner;

public class NumberSignPrinter {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n>0){
            System.out.println("+");
        } else if (n<0) {
            System.out.println("-");
        }else{
            System.out.println("0");
        }

    }
}
