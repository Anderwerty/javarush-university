package com.javarush.module2.lesson8;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Function;

public class Example4 {

    public static void main(String[] args) { // y(x)
//        Function<Integer, String> map =(times) -> {
//                StringBuilder builder  = new StringBuilder();
//            for (int i = 0; i < times; i++) {
//                builder.append("*");
//            }
//
//            return builder.toString();
//        };

        // user -> user.getName()  ====> User::getName
        method(Example4::duplicateStar);
        String line = null;

        if(Objects.isNull(line)){

        }

        new ArrayList<String>().stream().filter(Objects::isNull).forEach(x-> System.out.println(x));
    }

    private  static  void method(Function<Integer, String> mapper){
        String result = mapper.apply(10);
        System.out.println(result);
    }

    public static String duplicateStar(Integer times){
        StringBuilder builder  = new StringBuilder();
        for (int i = 0; i < times; i++) {
            builder.append("*");
        }

        return builder.toString();
    }
}


