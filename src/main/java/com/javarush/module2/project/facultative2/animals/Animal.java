package com.javarush.module2.project.facultative2.animals;

import com.javarush.module2.project.facultative2.Coordinates;
import com.javarush.module2.project.facultative2.island.Island;
import com.javarush.module2.project.facultative2.island.Location;

import java.util.List;

//SOLID
public abstract class Animal {

    private static final int MAX_STEP_NUMBER = 4;

    //  public abstract void eat();  // Нужен ли тут данный метод?

    public void eat(Location location) {
//        List<Animal> animals = location.getMenu(this);
//        Animal vic = findVictim(animals);

//        Class<? extends Animal> aClass = this.getClass();
//        Class<? extends Animal> aClass1 = vic.getClass();
//
//         boolean isEat = true;
//         if(true){
//             location.leave(vic);
//         }
    }

    public void breed(Location currentLocation) {
        currentLocation.newAnimal(this);
    }

    // animal -> 1
    public void chooseDirection(Location currentLocation, Island island) {
        int numberOfSteps = findStepsNumber();
        for (int i = 0; i < numberOfSteps; i++) {
            Coordinates coordinates = findNextCoordinates(currentLocation.coordinates, 100, 100);
            currentLocation.leave(this);

        }
//        island.moveToOtherLocation(coordinates, this);
    }

    private int findStepsNumber() {
        return 0;
    }


    protected abstract Coordinates findNextCoordinates(Coordinates currentCoordinates, int sizeA, int sizeB);


}


