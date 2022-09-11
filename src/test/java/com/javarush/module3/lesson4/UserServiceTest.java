package com.javarush.module3.lesson4;

import com.javarush.module3.lesson4.entity.User;
import com.javarush.module3.lesson4.exception.DataBaseConnectionException;
import com.javarush.module3.lesson4.repository.UserRepository;
import com.javarush.module3.lesson4.service.PasswordEncoder;
import com.javarush.module3.lesson4.service.SavingSystem;
import com.javarush.module3.lesson4.service.UserService;
import com.javarush.module3.lesson4.validator.CredentialValidator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.Connection;

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

    @Mock
    private SavingSystem savingSystem;

    @Captor
    public ArgumentCaptor<User> captor;

    @InjectMocks
    private UserService userService;


    @Test
    @Disabled
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

    @Test
    void method() {
        String login = "login";
        String password = "password";
        userService.method(login, password);

        Mockito.verify(savingSystem).save(captor.capture());
        User value = captor.getValue();
        System.out.println(value);
    }

}

class Employee{

}
interface EmployeeRepository {
    List<Employee> findAll(Connection connection);
}

class SQLUserRepository implements  EmployeeRepository{

    @Override
    public List<Employee> findAll(Connection connection) {
        // classic implementation
        return null;
    }
}

class EmployeeRepositoryWithCache implements  EmployeeRepository{
    private final EmployeeRepository employeeRepository;
    private List<Employee> cache = null;

    EmployeeRepositoryWithCache(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public synchronized List<Employee> findAll(Connection connection){
        if(cache == null){
            cache = new ArrayList<>();
            cache.addAll(employeeRepository.findAll(connection));
        }
        return cache;
    }

}
