package com.javarush.module3.leeson4.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@Getter
public class User {
    private final Integer id;
    private final String login;
    private final String password;
}
