package com.javarush.module3.lesson4.repository;

import com.javarush.module3.lesson4.entity.User;
import com.javarush.module3.lesson4.exception.DataBaseConnectionException;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(String password, String login) throws DataBaseConnectionException;

    Optional<User> findById(Integer id);

    List<User> findAll();
}
