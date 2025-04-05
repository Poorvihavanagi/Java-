package com.xworkz.inheritance;

public class Home extends Building {

    @Override
    public void construct() {
        super.construct();
        System.out.println("Running construct in home...");
    }

    @Override
    public void paint() {
        super.paint();
        System.out.println("Running paint in home...");
    }

    @Override
    public void openDoors() {
        super.openDoors();
        System.out.println("Running open Doors in home...");
    }

    @Override
    public void closeWindows() {
        super.closeWindows();
        System.out.println("Running close Windows in home...");
    }

    @Override
    public void provideElectricity() {
        super.provideElectricity();
        System.out.println("Running provide Electricity in home...");
    }
}
