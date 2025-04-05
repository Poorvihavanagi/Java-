package com.xworkz.inheritance;

public class Tool extends Bucket {

    @Override
    public void fill() {
        super.fill();
        System.out.println("Running fill in tool...");
    }

    @Override
    public void empty() {
        super.empty();
        System.out.println("Running empty in tool...");
    }

    @Override
    public void checkWaterLevel() {
        super.checkWaterLevel();
        System.out.println("Running checkWaterLevel in tool...");
    }

    @Override
    public void carry() {
        super.carry();
        System.out.println("Running carry in tool...");
    }

    @Override
    public void clean() {
        super.clean();
        System.out.println("Running clean in tool...");
    }
}
