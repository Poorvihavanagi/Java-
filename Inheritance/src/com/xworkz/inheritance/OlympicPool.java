package com.xworkz.inheritance;

public class OlympicPool extends SwimmingPool{
    public void hostEvent(){
        System.out.println("Hosting an event near the water body");
    }
    public void measureDepth(SwimmingPool swimmingPool){
        swimmingPool.clean();
        swimmingPool.closePool();
        swimmingPool.openPool();
        swimmingPool.drainWater();
        swimmingPool.fillWater();

        if(swimmingPool instanceof OlympicPool){
            System.out.println("Swimming pool is an instance of olympic pool");
            OlympicPool olympicPool=(OlympicPool) swimmingPool;
            olympicPool.hostEvent();
        }
    }
}
