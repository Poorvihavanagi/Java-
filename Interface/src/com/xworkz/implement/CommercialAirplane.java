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
}
