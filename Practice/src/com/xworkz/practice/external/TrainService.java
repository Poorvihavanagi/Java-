package com.xworkz.practice.external;

import com.xworkz.practice.internal.RailwayAuthority;

public class TrainService {
    private RailwayAuthority railwayAuthority;

    public TrainService(RailwayAuthority railwayAuthority){
        this.railwayAuthority=railwayAuthority;
        System.out.println("Parameterized constructor");
    }
    public void announceDelays(){
        if(this.railwayAuthority!=null){
            System.out.println("Railway authority is not null");
            this.railwayAuthority.manageRoutes();
        }
        else{
            System.out.println("It is null");
        }
    }


}
