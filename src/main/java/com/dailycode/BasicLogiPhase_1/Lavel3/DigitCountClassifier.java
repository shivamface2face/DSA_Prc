package com.dailycode.BasicLogiPhase_1.Lavel3;

public class DigitCountClassifier {
    public static void main(String[] args) {
     int num=102;
     int absNum=Math.abs(num);
     if(absNum>100 && absNum<999){
         System.out.println("three digit number");;
     }
     int lastDigit=absNum%10;
     int mid=(absNum/10)%10;
     int firstDigit=absNum/100;

     if(mid>lastDigit && mid>firstDigit){
         System.out.println("mid is bigger than all");
     } else if (mid<lastDigit && mid<firstDigit) {
         System.out.println("mid is samller one");
     }else {
         System.out.println("nothing");
     }
    }
}

