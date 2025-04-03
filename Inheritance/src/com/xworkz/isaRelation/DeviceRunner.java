package com.xworkz.isaRelation;

import com.xworkz.inheritance.Device;
import com.xworkz.inheritance.SmartPhone;

public class DeviceRunner {
    public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone();
        smartphone.powerOn();
        smartphone.powerOff();
        smartphone.charge();
        smartphone.connectToNetwork();
        smartphone.performTask();

        Device device = new SmartPhone();
        device.powerOn();
        device.powerOff();
        device.charge();
        device.connectToNetwork();
        device.performTask();
    }
}