package com.xworkz.practice.runner;

import com.xworkz.practice.external.TrainService;
import com.xworkz.practice.internal.IndianRailwaysImpl;
import com.xworkz.practice.internal.RailwayAuthority;

public class RailwayAuthorityRunner {
    public static void main(String[] args) {
        RailwayAuthority railwayAuthority=new IndianRailwaysImpl();
        TrainService trainService=new TrainService(railwayAuthority);
        trainService.announceDelays();
    }
}
