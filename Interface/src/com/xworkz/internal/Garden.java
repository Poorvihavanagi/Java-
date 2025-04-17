package com.xworkz.internal;

public interface Garden {
    void plantFlowers();
    void waterPlants();
    void trimPlants();
    default void maintainGarden() {
        System.out.println("Maintaining the garden.");
    }
}
