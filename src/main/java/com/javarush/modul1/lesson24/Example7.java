package com.javarush.modul1.lesson24;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Example7 {
    public static void main(String[] args) {
        File hymnAzerbaijan = new File("src/main/resources/file2.txt");
        try (FileInputStream fin = new FileInputStream(hymnAzerbaijan)) {

            byte[] a = fin.readAllBytes();
            System.out.println(new String(a));

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println();
        System.out.println("---------------------------------------");
    }
}
