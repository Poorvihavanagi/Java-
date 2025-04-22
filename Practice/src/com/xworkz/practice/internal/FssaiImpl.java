package com.xworkz.practice.internal;

public class FssaiImpl implements FoodSafetyAuthority{
    @Override
    public void inspectHygiene() {
        System.out.println("Running inspect hygiene in FssaiImpl");
    }
}
