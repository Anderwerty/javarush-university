package com.javarush.module2.lesson17;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example1 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        Singleton singleton = Singleton.INSTANCE;
//        Singleton singleton1 = Singleton.INSTANCE;

        Class<Singleton> singletonClass = Singleton.class;


//        System.out.println(Singleton.class == Singleton.INSTANCE.getClass());

//        System.out.println(LocalDateTime.now() + " Invoke Get methods");
        Method[] methods = singletonClass.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println(method.getModifiers());
            System.out.println(method.getReturnType());
            printElements("exception types:", method.getExceptionTypes());
            printElements("parameter types:", method.getParameterTypes());
            printElements("annotation types:", method.getAnnotations());
            System.out.println(method.getGenericReturnType());
            System.out.println("===============");
        }

        System.out.println("Fields: ");
        Field[] fields = singletonClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
            System.out.println(field.getType().getName());
            System.out.println();
        }

//        Singleton singleton = Singleton.class.newInstance();

        Constructor declaredConstructor = singletonClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Singleton singleton = (Singleton) declaredConstructor.newInstance();


        System.out.println(singleton == Singleton.INSTANCE);
    }

    private static void printElements(String message, Annotation[] classes) {
        System.out.println(message);

        for (Annotation clazz : classes) {
            System.out.println(clazz.annotationType().getName());
        }
        System.out.println();

    }

    private static void printElements(String message, Class<?>[] classes) {
        System.out.println(message);

        for (Class<?> clazz : classes) {
            System.out.println(clazz.getName());
        }
        System.out.println();

    }
}

class Singleton {

    public static final Singleton INSTANCE = new Singleton();

    private static int counter = 0;

    private String value;

    // ?
    private Singleton() {
        System.out.println("Create singleton instance: " + (++counter));
    }

    @Deprecated
    public void publicMethod(int value, String message) throws Exception, RuntimeException {

    }

    private void privateMethod() {

    }
}
