package com.xworkz.implement;

import com.xworkz.internal.Stone;

public class GraniteStone implements Stone {
    public void breakDown() {
        System.out.println("Breaking down the granite stone into smaller pieces.");
    }

    public void polish() {
        System.out.println("Polishing the granite stone to a smooth finish.");
    }

    public void useInConstruction() {
        System.out.println("Using granite stone in construction for flooring and countertops.");
    }
    @Override
    public void maintain() {
        System.out.println("Maintaining the granite stone with regular cleaning and care.");
    }

    @Override
    public void recycle() {
        System.out.println("Recycling granite stone for reuse in landscaping.");
    }
}
