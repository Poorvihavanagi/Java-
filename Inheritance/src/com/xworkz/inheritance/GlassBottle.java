package com.xworkz.inheritance;

public class GlassBottle extends Bottle {

    public void empty(){
        System.out.println("empty bottle in glass bottle");
    }
    public void checkTransparency(Bottle bottle){
        bottle.fill();
        bottle.open();
        bottle.shake();
        bottle.close();
        bottle.pour();

        if(bottle instanceof GlassBottle){
            System.out.println("bottle is an instance of glass bottle");
            GlassBottle glassBottle=(GlassBottle) bottle;
            glassBottle.empty();
        }
    }
}
