package com.xworkz.inheritance;

public class Garment extends Shirt {

    @Override
    public void wear() {
        super.wear();
        System.out.println("Running wear in garment...");
    }

    @Override
    public void wash() {
        super.wash();
        System.out.println("Running wash in garment...");
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("Running fold in garment...");
    }

    @Override
    public void iron() {
        super.iron();
        System.out.println("Running iron in garment...");
    }

    @Override
    public void checkSize() {
        super.checkSize();
        System.out.println("Running checkSize in garment...");
    }
}
