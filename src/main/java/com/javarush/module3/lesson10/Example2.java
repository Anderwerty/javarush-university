package com.javarush.module3.lesson10;

import java.io.FileNotFoundException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.nio.file.Paths;

public class Example2 {
    public static void main(String[] args) throws FileNotFoundException {
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("http://javarush.ru"))
                .GET()
                .build();



        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://foo.com/"))
                .header("Content-Type", "application/json")
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofFile(Paths.get("file.json")))
                .build();

        //* assert
        //* API
    }
}
