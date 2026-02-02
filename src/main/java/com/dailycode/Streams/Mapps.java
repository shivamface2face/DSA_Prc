package com.dailycode.Streams;

import java.util.stream.Stream;

public class Mapps {
    public static void main(String[] args) {
        Stream<String> stringSteam=Stream.of("hellow","world","java");
        Stream<String>filteredStream=stringSteam.map((String name)->name.toLowerCase());
        filteredStream.forEach(System.out::println);
    }
}
