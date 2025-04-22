package com.xworkz.practice.external;

import com.xworkz.practice.internal.AviationDevice;

public class Drone {
    private AviationDevice aviationDevice;

    public Drone(AviationDevice aviationDevice){
        this.aviationDevice=aviationDevice;
        System.out.println("parameterized const");
    }

    public void captureAerialView(){
        if(this.aviationDevice!=null){
            System.out.println("Aviation device is not null");
            this.aviationDevice.flyRoute();
        }
        else{
            System.out.println("It is null");
        }
    }
}
