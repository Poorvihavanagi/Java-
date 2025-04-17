package com.xworkz.copies;

import com.xworkz.internal.Comb;
import com.xworkz.internal.Mirror;
import com.xworkz.brandNew.GroomingKit;

public class GroomingKitRunner {
    public static void main(String[] args) {
        Comb comb = new GroomingKit();
        comb.untangleHair();
        comb.cleanComb();
        comb.keepInDrawer();

        System.out.println("------------------------------");

        Mirror mirror = new GroomingKit();
        mirror.reflect();
        mirror.clean();
        mirror.hangOnWall();
    }
}
