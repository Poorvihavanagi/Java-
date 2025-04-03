package com.xworkz.inheritance;

public class Home extends Building
{
    public void construct() {
        super.construct();
        System.out.println("Running construct building in home");
    }
    public void paint() {
        super.paint();
        System.out.println("Running paint building in home");
    }
    public void openDoors() {
        super.openDoors();
        System.out.println("Running open door building in home");
    }
    public void closeWindows() {
        super.closeWindows();
        System.out.println("Running clean window building in home");
    }
    public void provideElectricity() {
        super.provideElectricity();
        System.out.println("Running provide electricity in home");
    }
}
