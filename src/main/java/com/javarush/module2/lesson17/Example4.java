package com.javarush.module2.lesson17;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Example4 {
    public static void main(String[] args) {
        InvocationHandler handler = new DynamicInvocationProxyHandler(new Test());
        ClassLoader classLoader = DynamicInvocationProxyHandler.class.getClassLoader();
        ITest o = (ITest) Proxy.newProxyInstance(classLoader,
                new Class[]{ITest.class}, handler);

        o.method(10);
    }
}

class DynamicInvocationProxyHandler implements InvocationHandler {

    //really instance for proxying
    private final Object object;

    DynamicInvocationProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();

        Object returnResult = method.invoke(object, args);
        long end = System.currentTimeMillis();
        System.out.println("Times: " + (end - start));

        return returnResult;
    }
}

// contract
interface ITest {
    void method(int times);
}

class Test implements ITest {

    @Override
    public void method(int times) {
        for (int i = 0; i < times; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}