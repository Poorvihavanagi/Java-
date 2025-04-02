package com.xworkz.inheritance;

public class Tool extends Bucket
{
    public void fill() {
        super.fill(); // Calls the parent method
        System.out.println("Filling the tool bucket...");
    }
    public void empty() {
        super.empty();
        System.out.println("Emptying the tool bucket...");
    }
    public void checkWaterLevel() {
        super.checkWaterLevel();
        System.out.println("Checking water level in the tool bucket...");
    }
    public void carry() {
        super.carry();
        System.out.println("Carrying the tool bucket...");
    }
    public void clean() {
        super.clean();
        System.out.println("Cleaning the tool bucket...");
    }
}
