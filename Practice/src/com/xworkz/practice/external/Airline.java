package com.xworkz.practice.external;

import com.xworkz.practice.internal.AviationAuthority;

public class Airline {
    private AviationAuthority aviationAuthority;

    public Airline(AviationAuthority aviationAuthority){
        this.aviationAuthority=aviationAuthority;
        System.out.println("Parameterized const");
    }
    public void approveFlightPlan(){
        if(this.aviationAuthority!=null){
            System.out.println("Aviation authority is not null");
            this.aviationAuthority.approveFlight();
        }
        else{
            System.out.println("It is null");
        }
    }
}
