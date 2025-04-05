package com.xworkz.inheritance;

public class Cloud extends Atmosphere {

    @Override
    public void regulateTemperature() {
        super.regulateTemperature();
        System.out.println("Running regulate Temperature in Cloud");
    }

    @Override
    public void provideOxygen() {
        super.provideOxygen();
        System.out.println("Running provide Oxygen in Cloud");
    }

    @Override
    public void controlWeather() {
        super.controlWeather();
        System.out.println("Running control Weather in Cloud");
    }

    @Override
    public void filterRadiation() {
        super.filterRadiation();
        System.out.println("Running filter Radiation in Cloud");
    }

    @Override
    public void supportCommunication() {
        super.supportCommunication();
        System.out.println("Running support Communication in Cloud");
    }
}
