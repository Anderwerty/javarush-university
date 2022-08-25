package com.javarush.module3.leeson4;

import java.util.Objects;

public class Example2 {
    public static void main(String[] args) {
        UserRepository userRepository = (password, login) -> new User(1, password, login);
        PasswordEncoder passwordEncoder = new StupidPasswordEncoder();
        CredentialValidator credentialValidator = (password, login)-> {};
        UserService userService =
                new UserService(userRepository, passwordEncoder, credentialValidator);

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

class User {
    private final Integer id;
    private final String login;
    private final String password;

    User(Integer id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}

// SOLID, S
interface UserRepository {
    User save(String password, String login) throws DataBaseConnectionException;
}

class DataBaseConnectionException extends RuntimeException {

}

interface PasswordEncoder {

    String encode(String rawPassword);
    String encode(int rawPassword);

    boolean isMatched(String rawPassword, String encodePassword);
}

interface CredentialValidator {
    void validate(String password, String login);
}


class StupidPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(String rawPassword) {
        System.out.println("stupid password encoder");
        return rawPassword;
    }

    @Override
    public String encode(int rawPassword) {
        return null;
    }

    @Override
    public boolean isMatched(String rawPassword, String encodePassword) {
        return Objects.equals(rawPassword, encodePassword);
    }
}

class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final CredentialValidator credentialValidator;

    UserService(UserRepository userRepository,
                PasswordEncoder passwordEncoder, CredentialValidator credentialValidator) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.credentialValidator = credentialValidator;
    }

    public User register(String password, String login) {
        credentialValidator.validate(password, login);

        String encodedPassword = passwordEncoder.encode(password);

        User user = userRepository.save(encodedPassword, login);

        return user;
    }
}
