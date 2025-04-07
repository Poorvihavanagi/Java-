package com.xworkz.inheritance;

public class Dolphin extends Aquatic{
    public void flickTail(){
        System.out.println("Fish is flicking its tail");
    }
    public void jump(Aquatic aquatic){
        aquatic.adaptToWater();
        aquatic.layEggs();
        aquatic.swim();
        aquatic.breatheUnderwater();
        aquatic.liveInWater();

        if(aquatic instanceof Dolphin){
            System.out.println("Aquatic is an instance of dolphin");
            Dolphin dolphin=(Dolphin) aquatic;
            dolphin.flickTail();
        }
    }
}
