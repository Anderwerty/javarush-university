package com.javarush.module2.lesson11;

import java.sql.Connection;
import java.util.List;

public class Example7 {
    public static void main(String[] args) {

    }
}

class Employee {

}

interface EmployeeRepository {
    List<Employee> findAll(Connection connection);
}


class EmployeeRepositoryImpl implements EmployeeRepository {
    @Override
    public List<Employee> findAll(Connection connection) {
        // classic implementation
        return null;
    }
}

class EmployeeRepositoryWithCache implements EmployeeRepository {

    private final EmployeeRepository employeeRepository;

    private List<Employee> cache;

    EmployeeRepositoryWithCache(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public synchronized List<Employee> findAll(Connection connection) {
        if(cache == null){
            cache = employeeRepository.findAll(connection);
        }

        return cache;
    }
}
