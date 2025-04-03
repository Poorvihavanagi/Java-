package com.xworkz.isaRelation;

import com.xworkz.inheritance.TV;
import com.xworkz.inheritance.SmartTV;

public class TVRunner {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();
        smartTV.turnOn();
        smartTV.turnOff();
        smartTV.changeChannel();
        smartTV.adjustVolume();
        smartTV.displayInfo();

        System.out.println("-----------------------------------------------------------");
        TV tv = new SmartTV();
        tv.turnOn();
        tv.turnOff();
        tv.changeChannel();
        tv.adjustVolume();
        tv.displayInfo();
    }
}
