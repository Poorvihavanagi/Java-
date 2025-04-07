package com.xworkz.inheritance;

public class Shrimp extends SeaFood {

    @Override
    public void cook() {
        super.cook();
        System.out.println("Running cook in shrimp");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Running eat in shrimp");
    }

    @Override
    public void store() {
        super.store();
        System.out.println("Running store in shrimp");
    }

    @Override
    public void checkFreshness() {
        super.checkFreshness();
        System.out.println("Running check freshness in shrimp");
    }

    @Override
    public void season() {
        super.season();
        System.out.println("Running season in shrimp");
    }

    public void peel(){
        System.out.println("running peel inn shrimp");
    }
}
