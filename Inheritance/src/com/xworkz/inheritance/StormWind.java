package com.xworkz.inheritance;

public class StormWind extends Wind{
    public void swayLeaves(){
        System.out.println("Breeze is making the leaves sway softly");
    }

    public void coolEnvironment(Wind wind){
        wind.blow();
        wind.carryParticles();
        wind.changeDirection();
        wind.decreaseSpeed();
        wind.increaseSpeed();

        if(wind instanceof StormWind){
            System.out.println("Wind is instance of storm wind");
            StormWind stormWind=(StormWind) wind;
            stormWind.swayLeaves();
        }
    }
}
