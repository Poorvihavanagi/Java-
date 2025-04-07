package com.xworkz.inheritance;

public class BagPack extends Bag {

    @Override
    public void open() {
        super.open();
        System.out.println("Running open in BagPack");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("Running close in BagPack");
    }

    @Override
    public void carry() {
        super.carry();
        System.out.println("Running carry in BagPack");
    }

    @Override
    public void checkCapacity() {
        super.checkCapacity();
        System.out.println("Running checkCapacity in BagPack");
    }

    @Override
    public void organizeItems() {
        super.organizeItems();
        System.out.println("Running organizeItems in BagPack");
    }

    public void buckleStrap() {
        System.out.println("Buckling the BagPack strap");
    }
}
