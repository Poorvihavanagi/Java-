package com.xworkz.practice.internal;

public class SamsungFridgeImpl implements ApplianceControl{
    @Override
    public void storeFood() {
        System.out.println("Running store food in samsung fridge");
    }
}
