package com.xworkz.inheritance;

public class Lily extends Flower{
    public void spreadFragrance() {
        System.out.println("Rose is spreading fragrance");
    }
    public void bloomInWater(Flower flower){
        if(flower instanceof Lily){
            System.out.println("Flower is instance of lily");
            Lily lily=(Lily) flower;
            lily.spreadFragrance();
        }
    }
}
