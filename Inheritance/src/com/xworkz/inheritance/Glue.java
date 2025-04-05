package com.xworkz.inheritance;

public class Glue extends Sticky {

    @Override
    public void apply() {
        super.apply();
        System.out.println("Running apply in glue");
    }

    @Override
    public void dry() {
        super.dry();
        System.out.println("Running dry in glue");
    }

    @Override
    public void bond() {
        super.bond();
        System.out.println("Running bond in glue");
    }

    @Override
    public void checkStickiness() {
        super.checkStickiness();
        System.out.println("Running checkStickiness in glue");
    }

    @Override
    public void remove() {
        super.remove();
        System.out.println("Running remove in glue");
    }
}
