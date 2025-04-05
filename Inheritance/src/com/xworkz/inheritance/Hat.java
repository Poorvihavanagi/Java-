package com.xworkz.inheritance;

public class Hat extends Cap {

    @Override
    public void wear() {
        super.wear();
        System.out.println("Running wear in Hat");
    }

    @Override
    public void checkMaterial() {
        super.checkMaterial();
        System.out.println("Running check Material in Hat");
    }

    @Override
    public void remove() {
        super.remove();
        System.out.println("Running remove in Hat");
    }

    @Override
    public void adjustStrap() {
        super.adjustStrap();
        System.out.println("Running adjust Strap in Hat");
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("Running fold in Hat");
    }
}
