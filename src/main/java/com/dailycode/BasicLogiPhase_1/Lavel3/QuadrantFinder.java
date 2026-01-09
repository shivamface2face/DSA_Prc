package com.dailycode.BasicLogiPhase_1.Lavel3;

public class QuadrantFinder {
    public static void main(String[] args) {
            int x=-2;
            int y=-3;
            if(x>0 && y>0){
                System.out.println("first");
            } else if (x>0 && y<0) {
                System.out.println("second");
            } else if (x<0 && y<0) {
                System.out.println("third");
            }else {
                System.out.println("fourth");
            }
    }
}

