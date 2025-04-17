package com.xworkz.internal;

public interface Soil {
    void absorbWater();
    void supportPlant();
    void provideNutrients();

    default void enrichSoil() {
        System.out.println("Enriching the soil with organic matter.");
    }
}
