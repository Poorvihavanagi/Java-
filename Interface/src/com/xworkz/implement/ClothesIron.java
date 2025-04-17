package com.xworkz.implement;

import com.xworkz.internal.Iron;

public class ClothesIron implements Iron {
    public void heatUp() {
        System.out.println("Heating up the clothes iron.");
    }

    public void pressClothes() {
        System.out.println("Pressing clothes with the iron.");
    }

    public void coolDown() {
        System.out.println("Cooling down the clothes iron.");
    }
    @Override
    public void checkTemperature() {
        System.out.println("Checking the temperature of the steam iron.");
    }

}
