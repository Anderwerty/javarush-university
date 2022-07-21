package com.javarush.module2.facultative3.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;
//class Collectors
public class Example {
    public static void main(String[] args) {
        Stream.of(1,2,3,4) .collect(Collectors.toSet());
    }
}
