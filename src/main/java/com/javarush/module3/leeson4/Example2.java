package com.javarush.module3.leeson4;

import com.javarush.module3.leeson4.validator.CredentialValidator;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Example2 {
    public static void main(String[] args) {
        UserRepository userRepository = null;
        PasswordEncoder passwordEncoder = new StupidPasswordEncoder();
        CredentialValidator credentialValidator = null;

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

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@Getter
class User {
    private final Integer id;
    private final String login;
    private final String password;
}

// SOLID, S
interface UserRepository {
    User save(String password, String login) throws DataBaseConnectionException;

    Optional<User> findById(Integer id);

    List<User> findAll();
}

class DataBaseConnectionException extends RuntimeException {

}

interface PasswordEncoder {

    String encode(String rawPassword);

    boolean isMatched(String rawPassword, String encodePassword);
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
