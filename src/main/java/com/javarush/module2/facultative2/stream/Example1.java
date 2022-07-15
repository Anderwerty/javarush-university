package com.javarush.module2.facultative2.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class Example1 {
    public static void main(String[] args) {

        Supplier<Map<String, Integer>> supplier =
                () -> new HashMap<>();

        BiConsumer<Map<String, Integer>, String> accumulator =
                (symbolToCount, item) -> {
                    symbolToCount.merge(item, 1, Integer::sum);
                };

        BiConsumer<Map<String, Integer>, Map<String, Integer>> combiner =
                (items1, items2) -> items1.putAll(items2);

        Map<String, Integer> map = Arrays.asList("a", "a", "a", "b", "c", "c", "k").stream()
                .collect(supplier, accumulator, combiner);

        map.forEach((k, v) -> System.out.println(k + " : " + v));


    }
}


