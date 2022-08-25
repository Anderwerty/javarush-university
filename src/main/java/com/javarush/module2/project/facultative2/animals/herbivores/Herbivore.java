package com.javarush.module2.project.facultative2.animals.herbivores;

import com.javarush.module2.project.facultative2.animals.Animal;
import com.javarush.module2.project.facultative2.plants.Plant;

public abstract class Herbivore extends Animal {

    public abstract void eat(Plant plant);

}
