package com.javarush.module4.lesson7;

import com.javarush.module4.lesson7.repository.ConnectionProvider;
import com.javarush.module4.lesson7.repository.UserRepository;
import com.javarush.module4.lesson7.repository.UserRepositoryImpl;

public class Main {
    public static void main(String[] args) {
        ConnectionProvider connectionProvider = new ConnectionProvider("database");
        UserRepository userRepository = new UserRepositoryImpl(connectionProvider);

        userRepository.findById(1).ifPresentOrElse(System.out::println, ()-> System.out.println("no user was found"));

    }
}
