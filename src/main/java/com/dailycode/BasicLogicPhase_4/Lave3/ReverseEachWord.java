package com.dailycode.BasicLogicPhase_4.Lave3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
        String sentence="Hello world from Java";
        String [] words=sentence.split(" ");
        String res="";
        for(String word:words){
            String rev="";
            for(int i=word.length()-1;i>=0;i--){
                rev=rev+word.charAt(i);
            }
            res=res+rev+" ";
        }
        System.out.println(res.trim());

//         new WAY
        String result= Arrays.stream(sentence.split(" "))
                .map(wordss->new StringBuilder(wordss).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(result);

    }
}
