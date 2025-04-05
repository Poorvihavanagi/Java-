package com.xworkz.inheritance;

public class Ring extends Jewelry {

    public void wear() {
        super.wear();
        System.out.println("Running wear in Ring");
    }

    public void shine() {
        super.shine();
        System.out.println("Running shine in Ring");
    }

    public void design() {
        super.design();
        System.out.println("Running design in Ring");
    }

    public void value() {
        super.value();
        System.out.println("Running value in Ring");
    }

    public void store() {
        super.store();
        System.out.println("Running store in Ring");
    }
}
