package com.javarush.module2.project.facultative2.island;


import com.javarush.module2.project.facultative2.Coordinates;
import com.javarush.module2.project.facultative2.animals.Animal;
import com.javarush.module2.project.facultative2.animals.herbivores.Herbivore;
import com.javarush.module2.project.facultative2.animals.herbivores.Horse;
import com.javarush.module2.project.facultative2.animals.predators.Predator;
import com.javarush.module2.project.facultative2.plants.Plant;

import java.util.ArrayList;
import java.util.List;

public class Location {

    public Coordinates coordinates;

    // Списки где будут хранитсья находящиеся на локации сущности
    public List<Herbivore> herbivores = new ArrayList<>();
    public List<Predator> predators = new ArrayList<>();
    List<Plant> plants = new ArrayList<>();


    public void leave(Animal animal) {
        if (animal instanceof Herbivore) {
            herbivores.remove(animal);
        } else if (animal instanceof Predator) {
            predators.remove(animal);
        }
        //
    }

    // ОПИСЫВАЕМ СОБЫТИЯ НА ЛОКАЦИИ
    public void calculate() {

        // В ЦИКЛЕ ПЕРЕБИРАЕМ ХИЩНИКОВ ИЗ ЛИСТА
        // И КАЖДОМУ ПО ОЧЕРЕДИ СУЕМ СПИСОК ТРАВОЯДНЫХ
        for (int i = 0; i < predators.size(); i++) {
            Predator predator = predators.get(i);
            predator.eat(herbivores);

            // РАЗМНОЖАЕМСЯ
            predator.breed(this);

            // ДВИГАЕМСЯ
            predator.chooseDirection(this, null); //TODO: how to move animal to next Location
        }

        // ТО ЖЕ САМОЕ ДЕЛАЕМ ДЛЯ ТРАВОЯДНЫХ

        for (int i = 0; i < herbivores.size(); i++) {
            // ... //
        }

    }

    @Override
    public String toString() {
        return " | | ";
    }

    public void comeToLocation(Animal animal) {
        if (animal instanceof Herbivore) {
            herbivores.add((Herbivore) animal);
        } else if (animal instanceof Predator) {
            predators.add((Predator) animal);
        }
    }

    public void newAnimal(Animal animal) {

    }


}

