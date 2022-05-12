package com.javarush.modul1.lesson22;

import java.io.Closeable;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        try (MyResources resources = new MyResources();
                InnerResources innerResources = new InnerResources(resources);
        ) {
            System.out.println("Work");

        }

        Scanner scanner = new Scanner(System.in);

    }
}

class MyResources implements Closeable {

    @Override
    public void close() {
        System.out.println("is closing");
    }
}

class InnerResources implements Closeable {
    private MyResources resources;

    InnerResources(MyResources resources) {
        this.resources = resources;
    }

    @Override
    public void close() {
        System.out.println("close inner resources");
    }
}
