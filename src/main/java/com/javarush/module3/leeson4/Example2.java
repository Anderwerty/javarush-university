package com.javarush.module3.leeson4;

import com.javarush.module3.leeson4.repository.UserRepository;
import com.javarush.module3.leeson4.service.PasswordEncoder;
import com.javarush.module3.leeson4.service.UserService;
import com.javarush.module3.leeson4.validator.CredentialValidator;

import java.util.Objects;

public class Example2 {
    public static void main(String[] args) {
        UserRepository userRepository = null;
        PasswordEncoder passwordEncoder = new StupidPasswordEncoder();
        CredentialValidator credentialValidator = null;

        UserService userService =
                new UserService(userRepository, passwordEncoder, credentialValidator, null);

        int counter = 3;

        while (counter == 0) {
            try {
                // doSomething
                break;
            } catch (Exception e) {
                counter--;
            }
        }
    }
}


class StupidPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(String rawPassword) {
        System.out.println("stupid password encoder");
        return rawPassword;
    }

    @Override
    public boolean isMatched(String rawPassword, String encodePassword) {
        return Objects.equals(rawPassword, encodePassword);
    }
}


