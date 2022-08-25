package com.javarush.module2.project.facultative2.animals.predators;


import com.javarush.module2.project.facultative2.Coordinates;
import com.javarush.module2.project.facultative2.animals.herbivores.Herbivore;
import com.javarush.module2.project.facultative2.island.Location;

import java.util.List;

public class Bear extends Predator {

    final double WEIGHT = 500;
    final double possibleDistance = 2;
    final double maxSatiety = 80;
    private double satiety;

    public double getSatiety() {
        return satiety;
    }

    public void setSatiety(double satiety) {
        this.satiety = satiety;
    }


    @Override
    public void eat(Location location) {

    }

    @Override
    protected Coordinates findNextCoordinates(Coordinates currentCoordinates, int sizeA, int sizeB) {
        return null;
    }

    @Override
    public void breed() {

    }

//    @Override
//    public void chooseDirection() {
//
//    }

    @Override
    public void eat(List<Herbivore> herbivores) {

    }
}
