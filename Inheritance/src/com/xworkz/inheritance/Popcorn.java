package com.xworkz.inheritance;

public class Popcorn extends Snack{
    public void openPacket(){
        System.out.println("open chips packet");
    }
    public void addButter(Snack snack){
        snack.eat();
        snack.open();
        snack.enjoy();
        snack.pack();
        snack.prepare();
        if(snack instanceof Popcorn){
            System.out.println("Snack is instance of Popcorn");
            Popcorn popcorn=(Popcorn) snack;
            popcorn.openPacket();
        }
    }
}
