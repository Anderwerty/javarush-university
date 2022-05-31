package com.javarush.module2.lesson6.example7;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example7 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("One", "Two", "Three");

        Stream<String> stream = strings.stream().map(x->x+"___");
        List<String> list = stream.collect(Collectors.toList());
        Set<String> set = stream.collect(Collectors.toSet());
    }
}
