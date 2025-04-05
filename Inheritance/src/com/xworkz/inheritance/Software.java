package com.xworkz.inheritance;

public class Software extends Technology {

    @Override
    public void develop() {
        super.develop();
        System.out.println("Running develop in software");
    }

    @Override
    public void upgrade() {
        super.upgrade();
        System.out.println("Running upgrade in software");
    }

    @Override
    public void implement() {
        super.implement();
        System.out.println("Running implement in software");
    }

    @Override
    public void support() {
        super.support();
        System.out.println("Running support in software");
    }

    @Override
    public void secure() {
        super.secure();
        System.out.println("Running secure in software");
    }
}
