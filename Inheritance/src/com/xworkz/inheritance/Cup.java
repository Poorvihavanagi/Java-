package com.xworkz.inheritance;

public class Cup extends Mug {

    @Override
    public void fill() {
        super.fill();
        System.out.println("Running fill in Cup");
    }

    @Override
    public void drink() {
        super.drink();
        System.out.println("Running drink in Cup");
    }

    @Override
    public void wash() {
        super.wash();
        System.out.println("Running wash in Cup");
    }

    @Override
    public void heat() {
        super.heat();
        System.out.println("Running heat in Cup");
    }

    @Override
    public void checkMaterial() {
        super.checkMaterial();
        System.out.println("Running check Material in Cup");
    }
}
