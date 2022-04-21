package com.javarush.lesson22;

public class Example2 {
    public static void main(String[] args) {
        try {
            validateEmail("eamail@com");
            validateLogin("login");
//        } catch (InvalidParameterException e) {
//            if ("email".equals(e.getMessage())) {
//                System.out.println("Problem with email");
//            } else if ("login".equals(e.getMessage())) {
//                System.out.println("issue with login");
//            } else {
//                System.out.println("???");
//            }
        } catch (InvalidEmailRuntimeException e) {
            System.out.println("Problem with email");
        } catch (InvalidLoginRuntimeException e) {
            System.out.println("issue with login");

        }

    }

    private static void validateEmail(String email) {
        //...
        if (!email.contains("@")) {
//            throw new InvalidParameterException("email");
            throw new InvalidEmailRuntimeException();
        }
    }

    private static void validateLogin(String login) {
        //..
        if (login.isEmpty()) {
//            throw new InvalidParameterException("login");
            throw new InvalidLoginRuntimeException();
        }
    }
}

class InvalidParameterException extends RuntimeException {
    private ExceptionType exceptionType;

    public InvalidParameterException(ExceptionType exceptionType) {
        this.exceptionType = exceptionType;
    }

    public InvalidParameterException(String message) {
        super(message);
    }

    public ExceptionType getExceptionType() {
        return exceptionType;
    }
}

enum ExceptionType {
    EMAIL_EXCEPTION,
    LOGIN_EXCEPTION;

}

class InvalidLoginRuntimeException extends RuntimeException {

}

class InvalidEmailRuntimeException extends RuntimeException {

}
