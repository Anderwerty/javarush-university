package com.javarush.modul1.lesson26;

import java.nio.file.Path;

public class Example {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Andrii_Shylin\\IdeaProjects\\javarush-university\\src\\main\\resources\\folder1\\file.txt";
        Path path = Path.of(fileName);

        Path filePath = path.getFileName();
        System.out.println(filePath);

        System.out.println(path.getNameCount());
        System.out.println(path.toAbsolutePath());
        System.out.println(path.getFileSystem());
        System.out.println(path.getName(0));
        System.out.println(path.getName(4));
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.subpath(2, 5));


    }
}
