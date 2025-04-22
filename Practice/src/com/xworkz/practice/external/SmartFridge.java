package com.xworkz.practice.external;

import com.xworkz.practice.internal.ApplianceControl;

public class SmartFridge {
    private ApplianceControl applianceControl;

    public SmartFridge(ApplianceControl applianceControl){
        this.applianceControl=applianceControl;
        System.out.println("Parameterized const");
    }

    public void adjustTemperature(){
        if(this.applianceControl!=null){
            this.applianceControl.storeFood();
            System.out.println("Not null");
        }
        else{
            System.out.println("It is null");
        }
    }
}
