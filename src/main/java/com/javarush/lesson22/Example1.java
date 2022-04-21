package com.javarush.lesson22;

import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        String line = null; //NPE ?
        Map<String, String> line1 = null;
        if(line == null){
            throw new MyIllegalArgumentException();
        }
        line.length();



    }

    //NPE
}

class MyIllegalArgumentException extends RuntimeException {

}




