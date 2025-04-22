package com.xworkz.practice.external;

import com.xworkz.practice.internal.HomeAutomationSystem;

public class SmartLight {
    private HomeAutomationSystem homeAutomationSystem;

    public SmartLight(HomeAutomationSystem homeAutomationSystem){
        this.homeAutomationSystem=homeAutomationSystem;
        System.out.println("Parameterized const");
    }

    public void turnOff(){
        if(this.homeAutomationSystem!=null){
            System.out.println("Not null");
            this.homeAutomationSystem.turnOn();
        }
        else{
            System.out.println("It is null");
        }
    }
}
