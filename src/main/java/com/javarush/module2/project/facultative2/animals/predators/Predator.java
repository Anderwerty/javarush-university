package com.javarush.module2.project.facultative2.animals.predators;

import com.javarush.module2.project.facultative2.animals.Animal;
import com.javarush.module2.project.facultative2.animals.herbivores.Herbivore;

import java.util.List;

public abstract class Predator extends Animal {

    public abstract void breed();

    public abstract void eat(List<Herbivore> herbivores);

}
