package com.xworkz.runner;

import com.xworkz.internal.Soil;
import com.xworkz.implement.FertileSoil;

public class SoilRunner {
    public static void main(String[] args) {
        Soil soil = new FertileSoil();
        soil.absorbWater();
        soil.supportPlant();
        soil.provideNutrients();
    }
}
