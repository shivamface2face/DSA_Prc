package com.dailycode.Streams;
import java.util.*;
import java.util.*;
import java.util.stream.Stream;
public class FlatStreamss {
    public static void main(String[] args) {
        List<List<String>>list=Arrays.asList(
                Arrays.asList("I","Love","Java"),
                Arrays.asList("I","Love","c++"),
                Arrays.asList("I","Love","python")
                );
        Stream<String>pl1=list.stream().flatMap((List<String>str) ->str.stream());
        pl1.forEach(System.out::println);
    }
}
