package com.xworkz.isaRelation;

import com.xworkz.inheritance.Bottle;
import com.xworkz.inheritance.Container;

public class BottleRunner
{
    public static void main(String... args){

        Container container=new Container();
        container.fill();
        container.pour();
        container.open();
        container.close();
        container.shake();

        Bottle bottle=new Container();
        bottle.fill();
        bottle.pour();
        bottle.open();
        bottle.close();
        bottle.shake();
    }
}
