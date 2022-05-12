package com.javarush.module2.lesson1;

public class Example3 {
    public static void main(String[] args) {

    }
}

class Entity {
    private int id;
    private String name;

    public Entity(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

//SOLID
class User extends Entity {
    private String password;

    public User(int id, String name, String password) {
        super(id, name);
        this.password = password;
    }
}

class Pet extends Entity {

    public Pet(int id, String name) {
        super(id, name);
    }
}

class VipUser extends User {
    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    private int stars;

    public VipUser(int id, String name, String password) {
        super(id, name, password);
    }
}


