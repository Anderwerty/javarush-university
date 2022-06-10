package com.javarush.module2.lesson10;

import java.io.File;
import java.util.function.BiPredicate;

public class Example4 {
    public static void main(String[] args) {
        File file = new File("src/main/resources");
        findInFiles(file, (f, p) -> f.getName().endsWith(p), "txt");
    }

    private static <P> void findInFiles(File file, BiPredicate<File, P> searchCondition, P parameter) {
        if (file.isDirectory()) {
            findInFolder(file, searchCondition, parameter);
        } else {
            if (searchCondition.test(file, parameter)) {
                System.out.println(file.getAbsolutePath());
            }
        }
    }

    private static <P> void findInFolder(File file, BiPredicate<File, P> searchCondition, P parameter) {
        File[] files = file.listFiles();
        for (File f : files) {
            findInFiles(f, searchCondition, parameter);
        }
    }
}
