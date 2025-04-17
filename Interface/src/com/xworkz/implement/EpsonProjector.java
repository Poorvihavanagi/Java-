package com.xworkz.implement;

import com.xworkz.internal.Projector;

public class EpsonProjector implements Projector {
    public void turnOn() {
        System.out.println("Projector turned on.");
    }

    public void showPresentation() {
        System.out.println("Showing presentation.");
    }

    public void turnOff() {
        System.out.println("Projector turned off.");
    }
    @Override
    public void adjustBrightness() {
        System.out.println("Adjusting brightness for the LED projector.");
    }

    @Override
    public void adjustVolume() {
        System.out.println("Adjusting sound volume for the LED projector.");
    }
}
