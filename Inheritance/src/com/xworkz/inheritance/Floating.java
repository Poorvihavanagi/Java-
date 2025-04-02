package com.xworkz.inheritance;

public class Floating extends Boat{

    public void sail() {
        super.sail();
        System.out.println("Running sail in float");
    }
    public void anchor() {
        super.anchor();
        System.out.println("Running anchor in float");
    }

    public void loadCargo() {
        super.loadCargo();
        System.out.println("Running load cargo in float");
    }

    public void startEngine() {
        super.startEngine();
        System.out.println("Running Start engine in float");
    }

    public void stopEngine() {
        super.stopEngine();
            System.out.println("Running stop engine in float");
        }
}
