package com.javarush.module3.lesson4.validator;

public class CredentialValidatorImpl implements CredentialValidator {
    //
    // password is not null
    // length 6 - 10
    // [a-z,A-Z,0-9,_,#,!,^,&]
    // regex
    //===============
    // login = email
    // login is not null
    // regex
    @Override
    public void validate(String password, String login) {
        validateOnNull(password, "Password is null");
        validateOnNull(login, "Login is null");
        //regex ***
    }

    private void validateOnNull(String password, String message) {
        if (password == null) {
            throw new IllegalArgumentException(message);
        }
    }
}
