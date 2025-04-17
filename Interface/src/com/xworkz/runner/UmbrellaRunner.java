package com.xworkz.runner;

import com.xworkz.implement.MonsoonUmbrella;
import com.xworkz.internal.Umbrella;

public class UmbrellaRunner {
    public static void main(String[] args) {
        Umbrella umbrella = new MonsoonUmbrella();
        umbrella.open();
        umbrella.close();
        umbrella.protectFromRain();
        umbrella.store();
        umbrella.dry();
    }
}
