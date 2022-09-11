package com.javarush.module3.lesson4.service;

import com.javarush.module3.lesson4.entity.User;
import com.javarush.module3.lesson4.repository.UserRepository;
import com.javarush.module3.lesson4.validator.CredentialValidator;

public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final CredentialValidator credentialValidator;
    private final SavingSystem savingSystem;

    public UserService(UserRepository userRepository,
                       PasswordEncoder passwordEncoder,
                       CredentialValidator credentialValidator, SavingSystem savingSystem) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.credentialValidator = credentialValidator;
        this.savingSystem = savingSystem;
    }

    public User register(String password, String login) {
        credentialValidator.validate(password, login);

        String encodedPassword = passwordEncoder.encode(password);

        User user = userRepository.save(encodedPassword, login);

        return user;
    }


    public void method(String password, String login){
        User user = new User(100, login, password);

        savingSystem.save(user);
    }
}

