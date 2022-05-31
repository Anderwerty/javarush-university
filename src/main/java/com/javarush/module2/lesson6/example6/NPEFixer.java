package com.javarush.module2.lesson6.example6;

import java.util.function.Function;

public class NPEFixer<T> {

    private static final NPEFixer EMPTY = new NPEFixer(null);
    private final T value;

    private NPEFixer(T value) {
        this.value = value;
    }

    public static <E> NPEFixer<E> of(E value) {
        return new NPEFixer<>(value);
    }

    public boolean isPresent() {
        return value != null;
    }

    public <T1> NPEFixer<T1> map(Function<T, T1> mapper) {
        if (mapper == null) {
            throw new IllegalArgumentException();
        }
        if (!isPresent()) {
            return EMPTY;
        }

        T1 apply = mapper.apply(value);
        return new NPEFixer<>(apply);

    }
}
