package com.xworkz.inheritance;

public class Karate extends MartialArts{
    public void practiceKicks() {
        System.out.println("Practicing various kicking techniques");
    }
    public void performPunch(MartialArts martialArts){
        if(martialArts instanceof Karate){
            System.out.println("Martial arts is instance of karate");
            Karate karate=(Karate) martialArts;
            karate.practiceKicks();
        }
    }

}
