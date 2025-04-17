package com.xworkz.copies;

import com.xworkz.brandNew.ConstructionMaterial;
import com.xworkz.internal.Stone;
import com.xworkz.internal.Cement;

public class ConstructionMaterialRunner {
    public static void main(String[] args) {
        Stone stoneMaterial = new ConstructionMaterial();
        stoneMaterial.breakDown();
        stoneMaterial.polish();
        stoneMaterial.useInConstruction();

        System.out.println("------------------------------");

        Cement cementMaterial = new ConstructionMaterial();
        cementMaterial.mixWithWater();
        cementMaterial.pour();
        cementMaterial.dry();
    }
}
