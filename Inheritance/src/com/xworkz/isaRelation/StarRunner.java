package com.xworkz.isaRelation;

import com.xworkz.inheritance.Star;
import com.xworkz.inheritance.CelestialBody;

public class StarRunner {
    public static void main(String[] args) {

        Star star = new Star();
        star.shine();
        star.rotate();
        star.revolve();
        star.emitLight();
        star.existInSpace();

        System.out.println("------------------------------------------------------------------------");
        CelestialBody celestialBody = new Star();
        celestialBody.shine();
        celestialBody.rotate();
        celestialBody.revolve();
        celestialBody.emitLight();
        celestialBody.existInSpace();
    }
}
