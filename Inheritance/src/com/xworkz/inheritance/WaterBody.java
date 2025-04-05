package com.xworkz.inheritance;

public class WaterBody extends SwimmingPool
{
    @Override
    public void fillWater(){
        super.fillWater();
        System.out.println("Running fill water in water body");
    }
    @Override
    public void drainWater() {
        super.drainWater();
        System.out.println("Running drain water in water body");
    }
    @Override
    public void clean() {
        super.clean();
        System.out.println("Running clean swimming pool in water body");
    }
    @Override
    public void openPool() {
        super.openPool();
        System.out.println("Running open pool in water body");
    }
    @Override
    public void closePool() {
        super.closePool();
        System.out.println("Running close pool in water body");
    }
}
