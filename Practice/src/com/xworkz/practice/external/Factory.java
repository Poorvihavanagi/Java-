package com.xworkz.practice.external;

import com.xworkz.practice.internal.PollutionControl;

public class Factory {
    private PollutionControl pollutionControl;

    public Factory(PollutionControl pollutionControl){
        this.pollutionControl=pollutionControl;
        System.out.println("Parameterized const");
    }

    public void reportViolations(){
        if(this.pollutionControl!=null){
            System.out.println("Pollution control is not null");
            this.pollutionControl.monitorEmissions();
        }
        else{
            System.out.println("It is null");
        }
    }
}
