package com.xworkz.runner;

import com.xworkz.internal.Tent;
import com.xworkz.implement.CampingTent;

public class TentRunner {
    public static void main(String[] args) {
        Tent tent = new CampingTent();
        tent.setUp();
        tent.occupy();
        tent.packUp();
    }
}
