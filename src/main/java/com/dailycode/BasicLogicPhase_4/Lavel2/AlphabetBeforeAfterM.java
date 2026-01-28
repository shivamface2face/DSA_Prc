package com.dailycode.BasicLogicPhase_4.Lavel2;

public class AlphabetBeforeAfterM {
    public static void main(String[] args) {
    String string = "Hellow";
     int beforeM=0;
     int afterM=0;
//     for(int i=0;i<string.length();i++){
//         char ch=string.charAt(i);
//         if((ch>='A' && ch<='M') || (ch>='a' && ch<='m')){
//             beforeM++;
//         }else {
//             afterM++;
//         }
//     }

//        another way using Character.toLowerCase()
        for(char ch:string.toCharArray()){
            char toUpper=Character.toUpperCase(ch);
            if(toUpper<='M'){
                beforeM++;
            }else {
                afterM++;
            }
        }

        System.out.println("Alphabets before M :"+beforeM);
        System.out.println("Alphabets after M :"+afterM);
    }
}
