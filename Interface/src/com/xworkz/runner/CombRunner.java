package com.xworkz.runner;

import com.xworkz.internal.Comb;
import com.xworkz.implement.HairComb;

public class CombRunner {
    public static void main(String[] args) {
        Comb comb = new HairComb();
        comb.untangleHair();
        comb.cleanComb();
        comb.keepInDrawer();

        comb.sanitize();
        comb.display();
    }
}
