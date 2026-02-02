package com.dailycode.Streams;

import java.util.ArrayList;
import java.util.List;

public class Samples {
    public static void main(String[] args) {
        List<Integer>li=new ArrayList<>();
        li.add(78);
        li.add(23);
        li.add(12);
        li.add(34);

        long out=li.stream().filter((Integer val)->val>50).count();
        System.out.println(out);
    }

}
