package com.dailycode.BasicLogicPhase_4.Lavel2;

public class VowelWordStarter {
    public static void main(String[] args) {
    String words[]={"apple","banna","cat","orange","umbrella","dog"};
    int count=0;
      for (int i=0;i<words.length;i++){
          char firstChar=words[i].charAt(0);
          if(String.valueOf(firstChar).matches("[aeiouAEIOU]")){
              count++;
          }
      }
        System.out.println(count);
    }
}
