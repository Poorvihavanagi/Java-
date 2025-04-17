package com.xworkz.runner;

import com.xworkz.implement.WaterBottle;
import com.xworkz.internal.Bottle;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle=new WaterBottle();
        bottle.fill();;
        bottle.drink();
        bottle.empty();
        bottle.clean();
        bottle.store();
    }
}
