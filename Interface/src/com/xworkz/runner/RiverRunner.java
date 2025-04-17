package com.xworkz.runner;

import com.xworkz.internal.River;
import com.xworkz.implement.GangaRiver;

public class RiverRunner {
    public static void main(String[] args) {
        River river = new GangaRiver();
        river.flow();
        river.provideWater();
        river.supportEcosystem();
        river.flood();
        river.dryUp();
    }
}
