package com.javarush.module3.lesson10;

public class Example {
    public static void main(String[] args) {
        User user = User.builder()
                .withEmail("email@gmail.com")
                .withName("name")
                .withPassword("password")
                .withSurname("surname")
                .build();

    }
}


//

class User {

    private final String name;
    private final String surname;
    private final String email;
    private final String password;

    private User(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.password = builder.password;
    }


    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String surname;
        private String email;
        private String password;

        private Builder() {
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
