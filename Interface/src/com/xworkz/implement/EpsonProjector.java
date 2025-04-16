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
}
