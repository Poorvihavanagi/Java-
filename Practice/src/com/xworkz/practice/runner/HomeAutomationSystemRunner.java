package com.xworkz.practice.runner;

import com.xworkz.practice.external.SmartLight;
import com.xworkz.practice.internal.HomeAutomationSystem;
import com.xworkz.practice.internal.PhilipsHueImpl;

public class HomeAutomationSystemRunner {
    public static void main(String[] args) {
        HomeAutomationSystem homeAutomationSystem=new PhilipsHueImpl();
        SmartLight smartLight=new SmartLight(homeAutomationSystem);
        smartLight.turnOff();
    }
}
