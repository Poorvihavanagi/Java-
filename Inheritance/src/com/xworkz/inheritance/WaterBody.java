package com.xworkz.inheritance;

public class WaterBody extends SwimmingPool
{
    public void fillWater(){
        super.fillWater();
        System.out.println("Running fill water in water body");
    }
    public void drainWater() {
        super.drainWater();
        System.out.println("Running drain water in water body");
    }
    public void clean() {
        super.clean();
        System.out.println("Running clean swimming pool in water body");
    }
    public void openPool() {
        super.openPool();
        System.out.println("Running open pool in water body");
    }
    public void closePool() {
        super.closePool();
        System.out.println("Running close pool in water body");
    }
}
