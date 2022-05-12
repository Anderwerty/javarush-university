package com.javarush.modul1.lesson24;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example4 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/file.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream)) {
            char[] buffer = new char[100];
            while (inputStreamReader.read(buffer) != -1) {
                System.out.println(buffer);
                buffer = new char[100];
            }
        } catch (IOException e) {
            System.out.println("error");
        }


    }
}
