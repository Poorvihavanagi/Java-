package com.xworkz.isaRelation;

import com.xworkz.inheritance.Planet;
import com.xworkz.inheritance.Earth;

public class PlanetRunner {
    public static void main(String[] args) {
        Earth earth = new Earth();
        earth.rotate();
        earth.revolve();
        earth.supportLife();

        System.out.println("------------------------------------------");
        Planet planet = new Earth();
        planet.rotate();
        planet.revolve();
        planet.supportLife();
    }
}
