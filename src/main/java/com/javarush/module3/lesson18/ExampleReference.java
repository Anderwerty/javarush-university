package com.javarush.module3.lesson18;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;

public class ExampleReference {
    public static void main(String[] args) {
        ClassA classA = new ClassA(); // strong reference

        SoftReference<ClassA> classASoftReference = new SoftReference<>(new ClassA());
        ClassA classA1 = classASoftReference.get();
        System.out.println(classA1);

        WeakReference<ClassA> classAWeakReference = new WeakReference<>(new ClassA());
        System.out.println("-".repeat(10));
        int counter = 0;
        do {
//            System.gc();
            counter++;
            System.out.println(counter + " : " + classAWeakReference.get());

        } while (classAWeakReference.get() != null);

        System.out.println(classAWeakReference.get());


    }
}

class ClassA {


    @Override
    public String toString() {
        return "I'm here";
    }

}


