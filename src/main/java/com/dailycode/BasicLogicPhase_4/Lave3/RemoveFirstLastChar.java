package com.dailycode.BasicLogicPhase_4.Lave3;

public class RemoveFirstLastChar {
    public static void main(String[] args) {
        String string = "hello";
        String res="";
        for(int i=1;i<string.length()-1;i++){
            res+=string.charAt(i);
        }
        System.out.println(res  );
    }
}
