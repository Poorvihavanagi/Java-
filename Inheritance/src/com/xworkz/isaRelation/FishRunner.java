package com.xworkz.isaRelation;

import com.xworkz.inheritance.Aquatic;
import com.xworkz.inheritance.Dolphin;
import com.xworkz.inheritance.Fish;

public class FishRunner {
    public static void main(String[] args) {

        Aquatic aquatic = new Aquatic();
        aquatic.swim();
        aquatic.breatheUnderwater();
        aquatic.layEggs();
        aquatic.adaptToWater();
        aquatic.liveInWater();

        System.out.println("----------------------------------");


        Fish fish = new Fish();
        fish.swim();
        fish.breatheUnderwater();
        fish.layEggs();
        fish.adaptToWater();
        fish.liveInWater();

        System.out.println("----------------------------------");

        Dolphin dolphin=new Dolphin();
        dolphin.jump(dolphin);
    }
}
