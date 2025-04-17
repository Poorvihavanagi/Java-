package com.xworkz.implement;

import com.xworkz.internal.Ship;

public class CargoShip implements Ship {
    public void sail() {
        System.out.println("The cargo ship is sailing on the ocean.");
    }

    public void loadCargo() {
        System.out.println("Loading cargo into the ship.");
    }

    public void dock() {
        System.out.println("The cargo ship is docking at the port.");
    }
    @Override
    public void checkEngine() {
        System.out.println("Performing engine check for the cargo ship.");
    }

    @Override
    public void soundHorn() {
        System.out.println("Cargo ship horn is sounded.");
    }
}
