package com.javarush.lesson26;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Example3 {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(""));
    }
}
