package com.javarush.module2.lesson8;

public class Example3 {
    public static void main(String[] args) {
        User user = VipUser.builder()
                .withSurname("Shevchenko")
                .withCode(10)
                .withName("Alex")
                .build();
    }
}

class User {
    private final String name;
    private final String surname;

    protected User(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder<T extends Builder<T>> {
        private String name;
        private String surname;

        public User build() {
            return new User(this);
        }

        protected Builder() {

        }

        public T withName(String name) {
            this.name = name;
            return self();
        }

        public T withSurname(String surname) {
            this.surname = surname;
            return self();
        }

        protected T self(){
            return (T) this;
        }
    }
}

class VipUser extends User {
    private final int code;

    public static VipBuilder builder() {
        return new VipBuilder();
    }

    protected VipUser(VipBuilder builder) {
        super(builder);
        this.code = builder.code;
    }

    public static class VipBuilder extends User.Builder<VipBuilder> {
        private int code;

        private VipBuilder() {

        }

        public VipBuilder withCode(int code) {
            this.code = code;
            return this;
        }
    }
}
