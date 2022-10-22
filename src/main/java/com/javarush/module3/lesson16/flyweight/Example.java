package com.javarush.module3.lesson16.flyweight;

public class Example {
}


class Item {
    private final int x;
    private final int y;
    private final Avatar avatar;

    Item(int x, int y, Avatar avatar) {
        this.x = x;
        this.y = y;
        this.avatar = avatar;
    }
}

class ItemA extends Item {
    private static final Avatar AVATAR = new Avatar("Kozak");

    ItemA(int x, int y) {
        super(x, y, AVATAR);
    }
}

class Avatar {
    private final String image;

    Avatar(String image) {
        this.image = image;
    }
}
