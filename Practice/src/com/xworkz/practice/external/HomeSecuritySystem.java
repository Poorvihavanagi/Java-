package com.xworkz.practice.external;

import com.xworkz.practice.internal.NestSecurityImpl;
import com.xworkz.practice.internal.SurveillanceSystem;

public class HomeSecuritySystem {
    private SurveillanceSystem surveillanceSystem;

    public HomeSecuritySystem(SurveillanceSystem surveillanceSystem){
        this.surveillanceSystem=surveillanceSystem;
        System.out.println("Parameterized const");
    }

    public void activateAlarm(){
        if(this.surveillanceSystem!=null){
            System.out.println("Not null ");
            this.surveillanceSystem.monitorCameras();
        }
        else{
            System.out.println("It is null");
        }
    }
}
