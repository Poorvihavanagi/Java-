package com.xworkz.inheritance;

public class Star extends CelestialBody {
    public void shine() {
        super.shine();
        System.out.println("The star is shining brightly in the sky...");
    }

    public void rotate() {
        super.rotate();
        System.out.println("The star is rotating slowly...");
    }

    public void revolve() {
        super.revolve();
        System.out.println("The star is revolving around the galaxy...");
    }

    public void emitLight() {
        super.emitLight();
        System.out.println("The star is emitting energy and light...");
    }

    public void existInSpace() {
        super.existInSpace();
        System.out.println("The star exists as part of the universe...");
    }
}
