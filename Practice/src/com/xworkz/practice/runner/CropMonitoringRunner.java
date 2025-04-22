package com.xworkz.practice.runner;

import com.xworkz.practice.external.AgricultureFarm;
import com.xworkz.practice.internal.CropMonitoring;
import com.xworkz.practice.internal.FarmTechMonitorImpl;

public class CropMonitoringRunner {
    public static void main(String[] args) {
        CropMonitoring cropMonitoring=new FarmTechMonitorImpl();
        AgricultureFarm agricultureFarm=new AgricultureFarm(cropMonitoring);
        agricultureFarm.irrigateCrops();
    }
}
