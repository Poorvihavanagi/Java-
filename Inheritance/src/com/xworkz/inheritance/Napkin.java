package com.xworkz.inheritance;

public class Napkin extends Cloth {

    public void absorb() {
        super.absorb();
        System.out.println("The napkin quickly absorbs spills.");
    }
    public void clean() {
        super.clean();
        System.out.println("The napkin is used to clean hands and face.");
    }
    public void fold() {
        super.fold();
        System.out.println("The napkin is neatly folded for use.");
    }
    public void dry() {
        super.dry();
        System.out.println("The napkin dries faster than a regular cloth.");
    }
    public void reuse() {
        super.reuse();
        System.out.println("Some napkins are reusable, while others are disposable.");
    }
}
