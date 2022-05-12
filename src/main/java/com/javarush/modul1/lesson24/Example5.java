package com.javarush.modul1.lesson24;

import java.io.*;

public class Example5 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/file.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            char[] buffer = new char[100];
            while (bufferedReader.read(buffer) != -1) {
                System.out.println(buffer);
                buffer = new char[100];
            }
        } catch (IOException e) {
            System.out.println("error");
        }    }
}
