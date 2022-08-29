package com.javarush.module3.leeson4.validator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CredentialValidatorImplTest {

    CredentialValidatorImpl objectUnderTest = new CredentialValidatorImpl();

    @Test
    void validateShouldThrowExceptionIfLoginIsNull() {
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                () -> objectUnderTest.validate("password", null));

        assertEquals("Login is null", expectedException.getMessage());
        Assertions.assertThat(expectedException.getMessage()).isEqualTo("Login is null");
    }

    @Test
    void validateShouldThrowExceptionIfPasswordIsNull() {
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                () -> objectUnderTest.validate(null, "login"));

        assertEquals("Password is null", expectedException.getMessage());
    }

    @Test
    void validateShouldThrowExceptionIfPasswordAndLoginAreNulls(){
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                () -> objectUnderTest.validate(null, null));

        assertEquals("Password is null", expectedException.getMessage());
    }

    @Test
    void validateShouldNotThrowExceptionForValidArguments(){
        objectUnderTest.validate("password", "login");
    }

}