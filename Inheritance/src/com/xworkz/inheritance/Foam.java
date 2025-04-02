package com.xworkz.inheritance;

public class Foam extends Snow{
    public void fall() {
        super.fall();
        System.out.println("Running snow fall in foam");
    }
    public void melt() {
        super.melt();
        System.out.println("Running snow melt in foam");
    }
    public void accumulate() {
        super.accumulate();
        System.out.println("Running snow accumulate in foam");
    }
    public void freeze() {
        super.freeze();
        System.out.println("Running snow freeze in foam");
    }
    public void sparkle() {
        super.sparkle();
        System.out.println("Running snow sparkle in foam");
    }
}
