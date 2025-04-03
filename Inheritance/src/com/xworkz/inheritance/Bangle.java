package com.xworkz.inheritance;

public class Bangle extends Accessory {

    public void wear() {
        super.wear();
        System.out.println("Wearing bangles on the wrist...");
    }
    public void remove() {
        super.remove();
        System.out.println("Removing the bangles carefully...");
    }
    public void checkMaterial() {
        super.checkMaterial();
        System.out.println("Checking if the bangles are made of gold, silver, or glass...");
    }
    public void clean() {
        super.clean();
        System.out.println("Cleaning the bangles with a soft cloth...");
    }

    public void store() {
        super.store();
        System.out.println("Storing the bangles in a jewelry box...");
    }
}
