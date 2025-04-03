package com.xworkz.inheritance;

public class Marble extends Stone {
    public void extract() {
        super.extract();
        System.out.println("Extracting fine-quality marble from the quarry...");
    }

    public void cut() {
        super.cut();
        System.out.println("Cutting marble into decorative slabs...");
    }

    public void polish() {
        super.polish();
        System.out.println("Polishing marble to achieve a glossy finish...");
    }

    public void use() {
        super.use();
        System.out.println("Using marble for flooring and sculptures...");
    }

    public void checkQuality() {
        super.checkQuality();
        System.out.println("Checking the purity and texture of marble...");
    }
}
