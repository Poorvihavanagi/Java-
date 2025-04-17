package com.xworkz.implement;

import com.xworkz.internal.Soil;

public class FertileSoil implements Soil {
    public void absorbWater() {
        System.out.println("Fertile soil is absorbing water efficiently.");
    }

    public void supportPlant() {
        System.out.println("Fertile soil is providing support to plant roots.");
    }

    public void provideNutrients() {
        System.out.println("Fertile soil is rich in nutrients for plant growth.");
    }
    @Override
    public void enrichSoil() {
        System.out.println("Enriching the fertile soil with organic matter.");
    }
}
