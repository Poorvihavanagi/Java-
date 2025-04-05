package com.xworkz.inheritance;

public class Carrot extends Vegetable {

    @Override
    public void grow() {
        super.grow();
        System.out.println("Running grow in Carrot");
    }

    @Override
    public void harvest() {
        super.harvest();
        System.out.println("Running harvest in Carrot");
    }

    @Override
    public void wash() {
        super.wash();
        System.out.println("Running wash in Carrot");
    }

    @Override
    public void chop() {
        super.chop();
        System.out.println("Running chop in Carrot");
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("Running cook in Carrot");
    }
}
