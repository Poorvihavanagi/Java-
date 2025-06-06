package com.xworkz.inheritance;

public class Pillow extends Bedding {

    @Override
    public void provideComfort() {
        super.provideComfort();
        System.out.println("Providing soft cushioning for the head...");
    }

    @Override
    public void supportHead() {
        super.supportHead();
        System.out.println("Adjusting head and neck support for better sleep...");
    }

    @Override
    public void adjustPosition() {
        super.adjustPosition();
        System.out.println("Fluffing the pillow for extra comfort...");
    }

    @Override
    public void checkMaterial() {
        super.checkMaterial();
        System.out.println("Checking if the pillow is made of memory foam or cotton...");
    }

    @Override
    public void clean() {
        super.clean();
        System.out.println("Washing the pillow to maintain hygiene...");
    }
}
