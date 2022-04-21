package com.javarush.lesson24;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example6 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/file1.txt");
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("Hello");
            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println("exception");
        }
    }
}
