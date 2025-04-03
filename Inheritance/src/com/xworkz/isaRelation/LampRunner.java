package com.xworkz.isaRelation;

import com.xworkz.inheritance.Lamp;
import com.xworkz.inheritance.ElectricLamp;


public class LampRunner {
    public static void main(String[] args) {
        ElectricLamp electricLamp = new ElectricLamp();
        electricLamp.turnOn();
        electricLamp.turnOff();
        electricLamp.adjustBrightness();
        electricLamp.checkBulb();
        electricLamp.clean();

        System.out.println("---------------------------------------------------------------");
        Lamp lamp = new ElectricLamp();
        lamp.turnOn();
        lamp.turnOff();
        lamp.adjustBrightness();
        lamp.checkBulb();
        lamp.clean();
    }
}
