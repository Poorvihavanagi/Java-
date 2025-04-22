package com.xworkz.practice.runner;

import com.xworkz.practice.external.SmartFridge;
import com.xworkz.practice.internal.ApplianceControl;
import com.xworkz.practice.internal.SamsungFridgeImpl;

public class ApplianceControlRunner {
    public static void main(String[] args) {
        ApplianceControl applianceControl=new SamsungFridgeImpl();
        SmartFridge smartFridge=new SmartFridge(applianceControl);
        smartFridge.adjustTemperature();
    }
}
