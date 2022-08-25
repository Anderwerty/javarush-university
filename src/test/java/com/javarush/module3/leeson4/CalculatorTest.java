package com.javarush.module3.leeson4;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    // <methodWeTest><ShouldReturnSomething/ShouldDoSomething/ShouldThrowException><If/When><Condition>

    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("My cat is Tom!")
//???
    void calculateShouldReturnDivisionResultForPossitiveNumbers() {
        Result actual = calculator.calculate(1, Operation.DIV, 2);
        Result expected = new Result(0);

        assertResult(expected, actual);
    }

    @Test
    void calculateShouldThrowExceptionWhenDivisionIsZero() {
        CalculationRuntimeException actualException = assertThrows(CalculationRuntimeException.class,
                () -> calculator.calculate(1, Operation.DIV, 0), "Exception should be thrown");

        assertEquals("Divisor is zero", actualException.getMessage());
    }

    private static void assertResult(Result actual, Result expected) {
        // null check
        assertEquals(actual.getValue(), expected.getValue());
    }
}