package com.xworkz.inheritance;


public class Gloves extends ProtectiveGear {
    public void wear() {
        super.wear();
        System.out.println("Wearing gloves for protection.");
    }
    public void remove() {
        super.remove();
        System.out.println("Removing gloves after use.");
    }
    public void checkMaterial() {
        super.checkMaterial();
        System.out.println("Checking if the gloves are made of latex or fabric.");
    }
    public void wash() {
        super.wash();
        System.out.println("Washing gloves properly for reuse.");
    }
    public void store() {
        super.store();
        System.out.println("Storing gloves in a clean and dry place.");
    }
}
