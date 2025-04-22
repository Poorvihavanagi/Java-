package com.xworkz.practice.external;

import com.xworkz.practice.internal.VehicleControl;

public class Car {
    private VehicleControl vehicleControl;

    public Car(VehicleControl vehicleControl){
        this.vehicleControl=vehicleControl;
        System.out.println("Parameterized const in car");
    }
    public void applyBrakes(){
        if(this.vehicleControl!=null){
            System.out.println("Vehicle control is not null");
            this.vehicleControl.startEngine();
        }
        else {
            System.out.println("It is null");
        }
    }
}
