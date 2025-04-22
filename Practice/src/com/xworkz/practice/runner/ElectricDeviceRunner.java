package com.xworkz.practice.runner;

import com.xworkz.practice.external.Fan;
import com.xworkz.practice.internal.CeilingFanImpl;
import com.xworkz.practice.internal.ElectricDevice;

public class ElectricDeviceRunner {
    public static void main(String[] args) {
        ElectricDevice electricDevice=new CeilingFanImpl();
        Fan fan=new Fan(electricDevice);
        fan.adjustSpeed();
    }
}
