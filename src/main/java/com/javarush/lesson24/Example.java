package com.javarush.lesson24;

import java.io.*;

public class Example {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/file.txt");
        char[] symbols = new char[10000];

        FileInputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//        int value;
//        while ((value = inputStreamReader.read()) != -1){
//            System.out.print(Character.valueOf((char)value));
//        }


        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int value;
        while ((value = bufferedReader.read()) != -1){
            System.out.print(Character.valueOf((char)value));
        }

        InputStream in = System.in;
    }
}
