package com.xworkz.inheritance;

public class Star extends CelestialBody {

    @Override
    public void shine() {
        super.shine();
        System.out.println("Running shine in star");
    }

    @Override
    public void rotate() {
        super.rotate();
        System.out.println("Running rotate in star");
    }

    @Override
    public void revolve() {
        super.revolve();
        System.out.println("Running revolve in star");
    }

    @Override
    public void emitLight() {
        super.emitLight();
        System.out.println("Running emit light in star");
    }

    @Override
    public void existInSpace() {
        super.existInSpace();
        System.out.println("Running exist in space in star");
    }
}
