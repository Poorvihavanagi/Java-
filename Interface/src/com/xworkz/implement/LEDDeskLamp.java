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
}
