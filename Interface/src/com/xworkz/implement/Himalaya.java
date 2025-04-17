package com.xworkz.implement;

import com.xworkz.internal.Mountain;

public class Himalaya implements Mountain {
    public void provideScenery() {
        System.out.println("Himalayas provide breathtaking scenery.");
    }

    public void supportWildlife() {
        System.out.println("Himalayas support diverse wildlife.");
    }

    public void attractClimbers() {
        System.out.println("Himalayas attract mountain climbers worldwide.");
    }
    @Override
    public void provideFreshAir() {
        System.out.println("Everest offers pure, crisp air at its summit.");
    }

    @Override
    public void offerAdventure() {
        System.out.println("Climbers experience ultimate adventure while scaling Everest.");
    }
}
