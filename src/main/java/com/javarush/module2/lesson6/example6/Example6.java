package com.javarush.module2.lesson6.example6;

import java.util.Optional;

public class Example6 {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        User user = userRepository.findById(1);
        if (user != null) {
            Address address = user.address;
            if (address != null) {
                City city = address.city;
                if (city != null) {
                    String cityName = city.cityName;
                }
            }
        }

         Optional.ofNullable(user)
                .map(User::getAddress)
                .map(address -> address.city)
                .map(city -> city.cityName)
                .filter(cityName ->cityName.contains("K"))
                .ifPresent(null);
    }
}

class User {
    public Address address;

    public Address getAddress() {
        return address;
    }
}

class Address {
    public City city;
}

class City {
    public String cityName;
}

class UserRepository {
    User findById(int id) {
        if (id == 1) {
            return new User();
        }
        return null;
    }
}
