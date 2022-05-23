package com.javarush.module2.lesson4.example3;

import java.util.Arrays;
import java.util.List;

public class CanonRunner {
    public static void main(String[] args) {
        CanonScanner canonScanner = new CanonScanner();

        CanonPrinter canonPrinter = new CanonPrinter();
        MFVCanon mfvCanon = new MFVCanon();

        List<Printer> printers  = Arrays.asList(canonPrinter, mfvCanon);

        List<Scanner> scanners = Arrays.asList(canonScanner, mfvCanon);

        for (Printer printer:printers) {
            printer.print();
        }

        for (Scanner scanner:scanners) {
            scanner.scan();
        }
    }
}
