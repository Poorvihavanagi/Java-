package com.xworkz.runner;

import com.xworkz.internal.DeskLamp;
import com.xworkz.implement.LEDDeskLamp;

public class DeskLampRunner {
    public static void main(String[] args) {
        DeskLamp deskLamp = new LEDDeskLamp();
        deskLamp.turnOn();
        deskLamp.adjustBrightness();
        deskLamp.turnOff();
    }
}
