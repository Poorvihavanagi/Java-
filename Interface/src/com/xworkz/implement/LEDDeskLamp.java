package com.xworkz.implement;

import com.xworkz.internal.DeskLamp;

public class LEDDeskLamp implements DeskLamp {
    public void turnOn() {
        System.out.println("Turning on the LED desk lamp.");
    }

    public void adjustBrightness() {
        System.out.println("Adjusting the brightness of the LED desk lamp.");
    }

    public void turnOff() {
        System.out.println("Turning off the LED desk lamp.");
    }
    @Override
    public void reset() {
        System.out.println("Resetting the LED desk lamp to default settings.");
    }

    @Override
    public void store() {
        System.out.println("Storing the LED desk lamp in a safe place.");
    }
}
