package com.xworkz.runner;

import com.xworkz.internal.Ship;
import com.xworkz.implement.CargoShip;

public class ShipRunner {
    public static void main(String[] args) {
        Ship ship = new CargoShip();
        ship.sail();
        ship.loadCargo();
        ship.dock();
        ship.checkEngine();
        ship.soundHorn();
    }
}
