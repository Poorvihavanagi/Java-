package com.xworkz.runner;

import com.xworkz.internal.Iron;
import com.xworkz.implement.ClothesIron;

public class IronRunner {
    public static void main(String[] args) {
        Iron iron = new ClothesIron();
        iron.heatUp();
        iron.pressClothes();
        iron.coolDown();
        iron.checkTemperature();
    }
}
