package com.xworkz.inheritance;

public class Silk extends Fabric {
    public void weave() {
        super.weave();
        System.out.println("Weaving fine silk fabric...");
    }

    public void dye() {
        super.dye();
        System.out.println("Dyeing silk with vibrant colors...");
    }

    public void wash() {
        super.wash();
        System.out.println("Washing silk with delicate care...");
    }

    public void dry() {
        super.dry();
        System.out.println("Drying silk fabric carefully...");
    }

    public void checkQuality() {
        super.checkQuality();
        System.out.println("Checking silk's smoothness and purity...");
    }
}
