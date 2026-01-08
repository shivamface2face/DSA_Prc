package com.dailycode.BasicLogiPhase_1.Lavel1;

public class TemperatureClassifier {
    public static void main(String[] args) {
      int temp=23;
      if(temp>40){
          System.out.println("hot");
      }else  if(temp>10 && temp<=40){
          System.out.println("warm");
      }else{
          System.out.println("cold");
      }
    }
}
