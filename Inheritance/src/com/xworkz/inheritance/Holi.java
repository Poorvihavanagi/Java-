package com.xworkz.inheritance;

public class Holi extends Festival{
    public void lightLamps(){
        System.out.println("Lighting diyas and decorating homes during Diwali");
    }
    public void playWithColor(Festival festival){
        festival.celebrate();
        festival.distributeSweets();
        festival.enjoyFireworks();
        festival.lightDecorations();
        festival.performRituals();

        if(festival instanceof Holi){
            System.out.println("Festival is an instance of holi");
            Holi holi=(Holi) festival;
            holi.lightLamps();
        }
    }
}
