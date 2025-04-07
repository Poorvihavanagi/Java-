package com.xworkz.inheritance;

public class Specs extends VisionAid {

    @Override
    public void correctVision() {
        super.correctVision();
        System.out.println("Running correct vision in specs");
    }

    @Override
    public void protectEyes() {
        super.protectEyes();
        System.out.println("Running protect eyes in specs");
    }

    @Override
    public void checkPower() {
        super.checkPower();
        System.out.println("Running check power in specs");
    }

    @Override
    public void clean() {
        super.clean();
        System.out.println("Running clean in specs");
    }

    @Override
    public void displayBrand() {
        super.displayBrand();
        System.out.println("Running display brand in specs");
    }

    public void cleanLenses(){
        System.out.println("Running clean lenses in specs");
    }
}
