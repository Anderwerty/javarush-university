package com.javarush.module2.project.facultative2.island;

import com.javarush.module2.project.facultative2.Coordinates;
import com.javarush.module2.project.facultative2.animals.Animal;

public class Island {

    private final Location[][] locations; // Map<Coordinates, Location>

    public Island(int a, int b) {
        this.locations = new Location[a][b];
    }

    public void initialize() {
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[i].length; j++) {
                Location location = new Location();

                locations[i][j] = location;
            }
        }
    }

    public void print() {
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[i].length; j++) {
                System.out.print(locations[i][j]);
            }
            System.out.println();
        }
    }

    public void moveToOtherLocation(Coordinates coordinates, Animal animal) {
        Location location = getLocationByCoordinates(coordinates);
        location.comeToLocation(animal);
    }

    private Location getLocationByCoordinates(Coordinates coordinates) {
        return null;
    }
}
