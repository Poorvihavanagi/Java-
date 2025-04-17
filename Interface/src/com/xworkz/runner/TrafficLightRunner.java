package com.xworkz.runner;

import com.xworkz.internal.TrafficLight;
import com.xworkz.implement.SmartTrafficLight;

public class TrafficLightRunner {
    public static void main(String[] args) {
        TrafficLight trafficLight = new SmartTrafficLight();
        trafficLight.turnRed();
        trafficLight.turnYellow();
        trafficLight.turnGreen();

        trafficLight.startAutomaticCycle();
        trafficLight.turnOff();
    }
}
