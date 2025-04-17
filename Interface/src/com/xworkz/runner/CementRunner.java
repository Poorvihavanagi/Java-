package com.xworkz.runner;

import com.xworkz.internal.Cement;
import com.xworkz.implement.ConcreteCement;

public class CementRunner {
    public static void main(String[] args) {
        Cement cement = new ConcreteCement();
        cement.mixWithWater();
        cement.pour();
        cement.dry();

        cement.setTimer();
        cement.checkConsistency();
    }
}
