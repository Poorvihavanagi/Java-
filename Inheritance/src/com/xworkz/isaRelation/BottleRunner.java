package com.xworkz.isaRelation;

import com.xworkz.inheritance.Bottle;
import com.xworkz.inheritance.Container;
import com.xworkz.inheritance.GlassBottle;

public class BottleRunner
{
    public static void main(String... args){

        Container container=new Container();
        container.fill();
        container.pour();
        container.open();
        container.close();
        container.shake();

        System.out.println("-----------------------------------------------");
        Bottle bottle=new Container();
        bottle.fill();
        bottle.pour();
        bottle.open();
        bottle.close();
        bottle.shake();

        System.out.println("-----------------------------------------------");
        GlassBottle glassBottle=new GlassBottle();
        glassBottle.checkTransparency(glassBottle);

    }
}
