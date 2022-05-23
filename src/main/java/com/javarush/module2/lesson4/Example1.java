package com.javarush.module2.lesson4;

@SuppressWarnings("unchecked")
public class Example1 {
    public static void main(String[] args) {
//        Executable executable = new ExecutableImpl();
        Executable executable = new Executable2Impl();
        executable.execute();
        ((ExecutableImpl)executable).method();
    }
}

interface Executable {
    void execute();
}

class ExecutableImpl implements Executable {

    public ExecutableImpl() {

    }

    @Override
    public void execute() {
        System.out.println("execute");
    }

    public void method(){
        System.out.println("method");
    }
}

class Executable2Impl implements Executable{

    @Override
    public void execute() {
        System.out.println("execute -2");
    }
}
