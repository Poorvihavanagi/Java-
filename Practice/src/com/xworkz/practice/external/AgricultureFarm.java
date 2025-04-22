package com.xworkz.practice.external;

import com.xworkz.practice.internal.CropMonitoring;

public class AgricultureFarm {
    private CropMonitoring cropMonitoring;

    public AgricultureFarm(CropMonitoring cropMonitoring){
        this.cropMonitoring=cropMonitoring;
        System.out.println("Parameterized const of agriculture farm");
    }

    public void irrigateCrops(){
        if(this.cropMonitoring!=null){
            this.cropMonitoring.monitorGrowth();
            System.out.println("Not null crop monitoring");
        }
        else{
            System.out.println("It is null");
        }
    }
}
