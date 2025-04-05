package com.xworkz.inheritance;

public class Napkin extends Cloth {

    @Override
    public void absorb() {
        super.absorb();
        System.out.println("Running absorb in napkin...");
    }

    @Override
    public void clean() {
        super.clean();
        System.out.println("Running clean in napkin...");
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("Running fold in napkin...");
    }

    @Override
    public void dry() {
        super.dry();
        System.out.println("Running dry in napkin...");
    }

    @Override
    public void reuse() {
        super.reuse();
        System.out.println("Running reuse in napkin...");
    }
}
