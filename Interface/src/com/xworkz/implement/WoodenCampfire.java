package com.xworkz.implement;

import com.xworkz.internal.Campfire;

public class WoodenCampfire implements Campfire {
    public void ignite() {
        System.out.println("Igniting the wooden campfire.");
    }

    public void maintainFire() {
        System.out.println("Maintaining the wooden campfire.");
    }

    public void extinguish() {
        System.out.println("Extinguishing the wooden campfire.");
    }
}
