package com.xworkz.nonPrimitiveTypes;

public class Space
{
    void explore(Planet planet) {
        if (planet != null) {
            planet.describe();
        } else {
            System.out.println("Planet is null");
        }
    }
}
