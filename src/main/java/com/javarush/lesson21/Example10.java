package com.javarush.lesson21;

public class Example10 {
    public static void main(String[] args) {
        Bclass bclass = new Bclass(0);
        bclass.value=10;

    }
}

class Aclass {
    public int value;

    public Aclass(){
        this(0);
    }

    public Aclass(int value){
        super();
        this.value = value;
    }

}

class Bclass extends Aclass{
    public int value;

    public Bclass(int value) {
        super.value =value;
        this.value = value;
    }

    public int getSuperValue(){
        return super.value;
    }
}
