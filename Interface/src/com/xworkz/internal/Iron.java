package com.xworkz.internal;

public interface Iron {
    void heatUp();
    void pressClothes();
    void coolDown();
    default void checkTemperature() {
        System.out.println("Checking the temperature of the iron.");
    }
}
