package com.xworkz.inheritance;

public class Floating extends Boat {

    @Override
    public void sail() {
        super.sail();
        System.out.println("Running sail in floating");
    }

    @Override
    public void anchor() {
        super.anchor();
        System.out.println("Running anchor in floating");
    }

    @Override
    public void loadCargo() {
        super.loadCargo();
        System.out.println("Running loadCargo in floating");
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Running startEngine in floating");
    }

    @Override
    public void stopEngine() {
        super.stopEngine();
        System.out.println("Running stopEngine in floating");
    }

    public void navigate(){
        System.out.println("Running navigate boat in floating");
    }
}
