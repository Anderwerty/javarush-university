package com.javarush.modul1.lesson26;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example4 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Andrii_Shylin\\IdeaProjects\\javarush-university\\src\\main\\resources");
        try (DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
            for (Path p : files)

                System.out.println(p);
        }
    }
}
