package com.xworkz.practice.runner;

import com.xworkz.practice.external.Car;
import com.xworkz.practice.internal.HondaCarImpl;
import com.xworkz.practice.internal.VehicleControl;

public class VehicleControlRunner {
    public static void main(String[] args) {
        VehicleControl vehicleControl=new HondaCarImpl();
        Car car=new Car(vehicleControl);
        car.applyBrakes();
    }
}
