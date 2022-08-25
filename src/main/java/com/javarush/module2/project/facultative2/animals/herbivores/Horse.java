package com.javarush.module2.project.facultative2.animals.herbivores;

import com.javarush.module2.project.facultative2.Coordinates;
import com.javarush.module2.project.facultative2.plants.Plant;

public class Horse extends Herbivore {

    public static final int MAX_NUMBER = 10;


    public static Horse createNewHorse(){
        return new Horse();
    }

    @Override
    protected Coordinates findNextCoordinates(Coordinates currentCoordinates, int sizeA, int sizeB) {
        return null;
    }

    @Override
    public void eat(Plant plant) {

    }
}
