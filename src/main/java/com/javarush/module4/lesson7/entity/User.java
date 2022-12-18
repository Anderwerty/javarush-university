package com.javarush.module4.lesson7.entity;

import java.util.UUID;

// jdbc dto
public class User {

    private int id;
    private String login;
    private String password;
    private String email;

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    //99.99999%
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID());
    }
}
