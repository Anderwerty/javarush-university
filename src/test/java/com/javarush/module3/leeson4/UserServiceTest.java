package com.javarush.module3.leeson4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private CredentialValidator credentialValidator;
//    private UserRepository userRepository = Mockito.mock(UserRepository.class);

    @Spy
    private PasswordEncoder passwordEncoder = new StupidPasswordEncoder();

    @InjectMocks
    private UserService userService;


    @Test
    void registerShouldThrowExceptionIfConnectionToDatabaseLost() {
        Mockito.doNothing().when(credentialValidator).validate("password", "login");

        when(passwordEncoder.encode(any(String.class)))
                .thenReturn("encodedPassword");

        when(userRepository.save("encodedPassword", "login"))
                .thenThrow(new DataBaseConnectionException());

        assertThrows(DataBaseConnectionException.class,
                () -> userService.register("password", "login"));

        verify(userRepository, never()).save("encodedPassword", "login");

    }

    @Test
    void register() {
        when(passwordEncoder.encode("password"))
//                .thenThrow(new RuntimeException())
                .thenReturn("encodedPassword")
                .thenReturn("blabla");
        System.out.println(passwordEncoder.encode("password"));
        System.out.println(passwordEncoder.encode("password"));
        System.out.println(passwordEncoder.encode("password"));


    }

}
