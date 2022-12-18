package com.javarush.module4.lesson7.repository;


import com.javarush.module4.lesson7.entity.User;

import java.util.Optional;

//CRUD
public interface UserRepository {
    void save(User user);

    Optional<User> findById(int id);
}
