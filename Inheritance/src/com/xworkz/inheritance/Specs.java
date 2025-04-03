package com.xworkz.inheritance;

public class Specs extends VisionAid {

    public void correctVision() {
        super.correctVision();
        System.out.println("Using spectacles to correct vision...");
    }
    public void protectEyes() {
        super.protectEyes();
        System.out.println("Specs providing UV protection...");
    }
    public void checkPower() {
        super.checkPower();
        System.out.println("Checking specs lens power...");
    }

    public void clean() {
        super.clean();
        System.out.println("Cleaning spectacles with microfiber cloth...");
    }
    public void displayBrand() {
        super.displayBrand();
        System.out.println("Specs brand: Ray-Ban...");
    }
}
