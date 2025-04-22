package com.xworkz.practice.runner;

import com.xworkz.practice.external.Drone;
import com.xworkz.practice.internal.AviationDevice;
import com.xworkz.practice.internal.DJIDroneImpl;

public class AviationDeviceRunner {
    public static void main(String[] args) {
        AviationDevice aviationDevice=new DJIDroneImpl();
        Drone drone=new Drone(aviationDevice);
        drone.captureAerialView();
    }
}
