package com.dailycode.Streams;

import java.util.Arrays;
import java.util.List;

public class Filterss {
    public static void main(String[] args) {
     List<Integer> list =Arrays.asList(12,34,5,6123,565,2323,90);
   Long ans=  list.stream().filter((Integer val)->val%2==0)
             .count();
        System.out.println(ans);

    }
}
