package com.dailycode.BasicLogicPhase_4.Lavel2;

public class CharacterTypeCounter {
    public static void main(String[] args) {
      String string = "Hello World 123!@#";
      int l=0 ,d=0, s=0;
        for (int i = 0; i < string.length(); i++) {
             char ch= string.charAt(i);
             if(Character.isDigit(ch)){
                 d++;
             }else if(Character.isLetter(ch)){
                 l++;
             }else{
                 s++;
             }


        }
        System.out.println("letter count :"+l);
        System.out.println("digit count :"+ d);
        System.out.println("space count :"+s);

    }
}
