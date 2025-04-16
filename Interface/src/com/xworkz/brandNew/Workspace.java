package com.xworkz.brandNew;

import com.xworkz.internal.DeskLamp;
import com.xworkz.internal.Cushion;

public class Workspace implements DeskLamp, Cushion {

    @Override
    public void turnOn() {
        System.out.println("Turning on the desk lamp.");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Adjusting the brightness of the desk lamp.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the desk lamp.");
    }

    @Override
    public void place() {
        System.out.println("Placing the cushion on the chair.");
    }

    @Override
    public void fluff() {
        System.out.println("Fluffing the cushion to maintain its shape.");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the cushion with a damp cloth.");
    }
}
