package com.xworkz.isaRelation;

import com.xworkz.inheritance.Atmosphere;
import com.xworkz.inheritance.Cloud;

public class CloudRunner {
    public static void main(String[] args) {

        Atmosphere atmosphere = new Atmosphere();
        atmosphere.regulateTemperature();
        atmosphere.provideOxygen();
        atmosphere.controlWeather();
        atmosphere.filterRadiation();
        atmosphere.supportCommunication();

        Cloud cloud = new Cloud();
        cloud.regulateTemperature();
        cloud.provideOxygen();
        cloud.controlWeather();
        cloud.filterRadiation();
        cloud.supportCommunication();
    }
}
