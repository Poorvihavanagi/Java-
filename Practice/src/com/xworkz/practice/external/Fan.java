package com.xworkz.practice.external;

import com.xworkz.practice.internal.ElectricDevice;

public class Fan {
    private ElectricDevice electricDevice;

    public Fan(ElectricDevice electricDevice){
        this.electricDevice=electricDevice;
        System.out.println("Electric device is parameterized const");
    }
    public void adjustSpeed(){
        if(this.electricDevice!=null){
            System.out.println("Electric device is not null");
            this.electricDevice.rotate();
        }
        else {
            System.out.println("It is null");
        }
    }
}
