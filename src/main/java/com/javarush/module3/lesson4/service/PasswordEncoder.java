package com.javarush.module3.lesson4.service;

public interface PasswordEncoder {

    String encode(String rawPassword);

    boolean isMatched(String rawPassword, String encodePassword);
}
