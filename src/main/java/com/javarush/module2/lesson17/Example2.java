package com.javarush.module2.lesson17;

import java.lang.reflect.Field;

public class Example2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        A a = new A();
        System.out.println(a);
        Field strValue = A.class.getDeclaredField("strValue");

        strValue.setAccessible(true);

        strValue.set(a, "Hello");

        Field staticInt = A.class.getDeclaredField("staticInt");
        staticInt.setAccessible(true);

        staticInt.set(a, 100);
        System.out.println(a);
    }
}

class A {
    private static int staticInt = 0;
    private final String strValue = "Hi";
    private int intValue;

    public String getStrValue() {
        return strValue;
    }

    public int getIntValue() {
        return intValue;
    }

    @Override
    public String toString() {
        return "A{" +
                "strValue='" + strValue + '\'' +
                ", intValue=" + intValue +
                ", static field value " + staticInt +
                '}';
    }
}
