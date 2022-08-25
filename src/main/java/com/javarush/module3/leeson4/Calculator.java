package com.javarush.module3.leeson4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;

import static com.javarush.module3.leeson4.Operation.ADD;
import static com.javarush.module3.leeson4.Operation.DIV;
import static com.javarush.module3.leeson4.Operation.MINUS;
import static com.javarush.module3.leeson4.Operation.MULT;

public class Calculator {
    private static final Map<Operation, BiFunction<Integer, Integer, Result>>
            OPERATION_BY_ACTION = new HashMap<>();

    static {
        OPERATION_BY_ACTION.put(ADD, (a, b) -> new Result(a - b));
        OPERATION_BY_ACTION.put(MINUS, (a, b) -> new Result(a - b));
        OPERATION_BY_ACTION.put(MULT, (a, b) -> new Result(a * b));
        OPERATION_BY_ACTION.put(DIV, (a, b) -> new Result(division(a, b)));

    }

    private static final BiFunction<Integer, Integer, Result> DEFAULT_ACTION = (a, b) -> new Result(0);

    public Result calculate(int argument1, Operation operation, int argument2) {
        return OPERATION_BY_ACTION.getOrDefault(operation, DEFAULT_ACTION).apply(argument1, argument2);
    }

    private static int division(Integer a, Integer b) {
        if (b == 0) {
            throw new CalculationRuntimeException("Divisor is zero");
        }

        return a / b;
    }
}

enum Operation {
    ADD, MINUS, MULT, DIV
}

final class Result {
    private final int value;

    public Result(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//        Result result = (Result) o;
//        return value == result.value;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(value);
//    }

    @Override
    public String toString() {
        return "Result{" +
                "value=" + value +
                '}';
    }
}

class CalculationRuntimeException extends RuntimeException {
    public CalculationRuntimeException(String message) {
        super(message);
    }
}
