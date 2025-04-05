package com.xworkz.inheritance;

public class Paint extends Coating {

    @Override
    public void apply() {
        super.apply();
        System.out.println("Running apply in paint...");
    }

    @Override
    public void dry() {
        super.dry();
        System.out.println("Running dry in paint...");
    }

    @Override
    public void checkQuality() {
        super.checkQuality();
        System.out.println("Running check quality in paint...");
    }

    @Override
    public void remove() {
        super.remove();
        System.out.println("Running remove in paint...");
    }

    @Override
    public void protectSurface() {
        super.protectSurface();
        System.out.println("Running protect surface in paint...");
    }
}
