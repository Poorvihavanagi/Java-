package com.xworkz.runner;

import com.xworkz.internal.Stone;
import com.xworkz.implement.GraniteStone;

public class StoneRunner {
    public static void main(String[] args) {
        Stone stone = new GraniteStone();
        stone.breakDown();
        stone.polish();
        stone.useInConstruction();

        stone.maintain();
        stone.recycle();
    }
}
