package com.dailycode.BasicLogicPhase_2.Lavel4;

public class PalindromeFinder {
    public static void main(String[] args) {

        for (int i = 1; i <=500 ; i++) {
            int org=i;
            int rev=0;
            int tem=i;
            while (tem!=0){
                int dig=tem%10;
                rev=rev*10+dig;
                tem=tem/10;
            }
            if (org==rev){
                System.out.println(i);
            }
        }
    }
}
