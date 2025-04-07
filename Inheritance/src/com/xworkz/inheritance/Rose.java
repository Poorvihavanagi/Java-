package com.xworkz.inheritance;

public class Rose extends Flower {

    public void bloom() {
        super.bloom();
        System.out.println("Running bloom in Rose");
    }

    public void smell() {
        super.smell();
        System.out.println("Running smell in Rose");
    }

    public void photosynthesize() {
        super.photosynthesize();
        System.out.println("Running photosynthesize in Rose");
    }

    public void attractBees() {
        super.attractBees();
        System.out.println("Running attractBees in Rose");
    }

    public void wither() {
        super.wither();
        System.out.println("Running wither in Rose");
    }
    public void spreadFragrance() {
        System.out.println("Rose is spreading fragrance");
    }
}
