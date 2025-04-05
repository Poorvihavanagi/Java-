package com.xworkz.inheritance;

public class Foam extends Snow{
    @Override
    public void fall() {
        super.fall();
        System.out.println("Running snow fall in foam");
    }
    @Override
    public void melt() {
        super.melt();
        System.out.println("Running snow melt in foam");
    }
    @Override
    public void accumulate() {
        super.accumulate();
        System.out.println("Running snow accumulate in foam");
    }
    @Override
    public void freeze() {
        super.freeze();
        System.out.println("Running snow freeze in foam");
    }
    @Override
    public void sparkle() {
        super.sparkle();
        System.out.println("Running snow sparkle in foam");
    }
}
