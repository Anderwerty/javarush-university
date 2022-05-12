package com.javarush.modul1.lesson26;

import java.nio.file.Path;

public class Example1 {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\Andrii_Shylin\\IdeaProjects\\javarush-university\\src\\main\\resources\\file.txt");
//        System.out.println(path.getFileName());
//        System.out.println(path.getNameCount());
//        System.out.println(path.toAbsolutePath());
//        System.out.println(path.getRoot());
//        System.out.println(path.subpath(1, 3));
//        System.out.println(path.isAbsolute());

        for (Path p:path) {
            System.out.println(p);
        }
    }
}
