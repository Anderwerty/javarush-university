package com.javarush.module2.facultative2.reflection;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MyJunitRunner {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
//        processTest(ClassUnderTest.class);
        processTest(ClassUnderTest2.class);


    }

    private static <T> void processTest(Class<T> clazz) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
//        Class<ClassUnderTest> clazz = ClassUnderTest.class;
        Method[] methods = clazz.getMethods();

        List<Method> testMethods = new ArrayList<>();
        List<Method> beforeAllMethods = new ArrayList<>();
        List<Method> afterAllMethods = new ArrayList<>();
        List<Method> beforeEachMethods = new ArrayList<>();
        List<Method> afterEachMethods = new ArrayList<>();

        for (Method method : methods) {
//            System.out.println(method.getName());
            if (method.isAnnotationPresent(Test.class)) {
                testMethods.add(method);
            } else if (method.isAnnotationPresent(BeforeMethod.class)) {
//                BeforeMethod annotation = method.getAnnotation(BeforeMethod.class);
//                Class<? extends Annotation> aClass = annotation.annotationType();
//                boolean annotationPresent = aClass.isAnnotationPresent(Inherited.class);
                beforeEachMethods.add(method);
            } else if (method.isAnnotationPresent(BeforeAll.class)) {
                beforeAllMethods.add(method);
            } else if (method.isAnnotationPresent(AfterMethod.class)) {
                afterEachMethods.add(method);
            } else if (method.isAnnotationPresent(AfterAll.class)) {
                afterAllMethods.add(method);
            }
        }

        Constructor<T> constructor = clazz.getDeclaredConstructor();

        T test = constructor.newInstance();

        // before all test methods  @BeforeAll
        invokeMethods(beforeAllMethods, test);

        //   beforeEachTest - test1 - afterEachTest
        //   beforeEachTest - test2 - afterEachTest
        //   beforeEachTest - test3 - afterEachTest

        for (Method testMethod : testMethods) {
            System.out.println("======================================");
            invokeMethods(beforeEachMethods, test); //@BeforeMethod
            testMethod.invoke(test); //@Test
            invokeMethods(afterEachMethods, test); //@AfterMethod
            System.out.println("======================================");
        }

        //after all test methods  @AfterAll
        invokeMethods(afterAllMethods, test);
    }

    private static <T> void invokeMethods(List<Method> methods, T test) throws IllegalAccessException, InvocationTargetException {
        for (Method method : methods) {
            method.invoke(test);
        }
    }
}

class ClassUnderTest {

    @BeforeAll
    public void initRecourseBeforeAllTest() {
        System.out.println("init recourse before all tests");
    }

    @AfterAll
    public void clearRecourseAfterAllTest() {
        System.out.println("clear recourse after all tests");
    }

    @BeforeMethod
    public void initRecourseBeforeEachTestMethod() {
        System.out.println("init recourse before  test method");
    }

    @AfterMethod
    public void clearRecourseAfterEachTestMethod() {
        System.out.println("clear recourse after test method");
    }

    @Test
    public void test1() {
        System.out.println("Test1");
    }

    @Test
    public void test2() {
        System.out.println("Test2");
    }

    @Test
    public void test3() {
        System.out.println("Test3");
    }
}


class ClassUnderTest2 extends ClassUnderTest {
    @Test
    public void test4(){
        System.out.println("test4");
    }
}
