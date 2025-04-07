package com.xworkz.isaRelation;

import com.xworkz.inheritance.OlympicPool;
import com.xworkz.inheritance.SwimmingPool;
import com.xworkz.inheritance.WaterBody;

public class PoolRunner
{
    public static void main(String[] args) {

        SwimmingPool swimmingPool=new WaterBody();
        swimmingPool.fillWater();
        swimmingPool.drainWater();
        swimmingPool.clean();
        swimmingPool.openPool();
        swimmingPool.closePool();

        System.out.println("------------------------------------------");
        WaterBody waterBody=new WaterBody();
        waterBody.fillWater();
        waterBody.drainWater();
        waterBody.clean();
        waterBody.openPool();
        waterBody.closePool();

        System.out.println("------------------------------------------");
        OlympicPool olympicPool=new OlympicPool();
        olympicPool.measureDepth(olympicPool);

    }
}
