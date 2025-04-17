package com.xworkz.implement;

import com.xworkz.internal.Airplane;

public class CommercialAirplane implements Airplane {
    public void takeOff() {
        System.out.println("The airplane is taking off.");
    }

    public void fly() {
        System.out.println("The airplane is flying.");
    }

    public void land() {
        System.out.println("The airplane is landing.");
    }
    @Override
    public void startEngines() {
        System.out.println("Running start engine in commercial plane from interface");
    }

    @Override
    public void shutdownEngines() {
        System.out.println("Running shut down engine in commercial plane from interface");
    }
}
