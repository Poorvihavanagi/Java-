package com.xworkz.runner;

import com.xworkz.implement.EpsonProjector;
import com.xworkz.internal.Projector;

public class ProjectorRunner {
    public static void main(String[] args) {
        Projector projector=new EpsonProjector();
        projector.turnOn();
        projector.turnOff();
        projector.showPresentation();
        projector.adjustBrightness();
        projector.adjustVolume();
    }
}
