package com.dailycode.BasicLogicPhase_2.Lavel3;

public class DivisibilityRangePrinter {
    public static void main(String[] args) {
      int start=10;
      int end=90;
      for(int i=start;i<=end;i++){
          if(i%7==0){
              System.out.println(i);
          }
      }
    }
}
