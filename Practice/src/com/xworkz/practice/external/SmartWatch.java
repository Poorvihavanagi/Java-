package com.xworkz.practice.external;

import com.xworkz.practice.internal.WearableDevice;

public class SmartWatch {
    private WearableDevice wearableDevice;

    public SmartWatch(WearableDevice wearableDevice){
        this.wearableDevice=wearableDevice;
        System.out.println("Smartwatch is parameterized const");
    }
    public void trackFitness(){
        if(this.wearableDevice!=null){
            System.out.println("Smart watch is not null");
            this.wearableDevice.trackActivity();
        }
        else{
            System.out.println("It is null");
        }
    }
}
