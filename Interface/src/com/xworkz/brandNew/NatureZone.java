package com.xworkz.brandNew;

import com.xworkz.internal.River;
import com.xworkz.internal.Mountain;

public class NatureZone implements River, Mountain {

    @Override
    public void flow() {
        System.out.println("River is flowing through the NatureZone.");
    }

    @Override
    public void provideWater() {
        System.out.println("River provides fresh water in the NatureZone.");
    }

    @Override
    public void supportEcosystem() {
        System.out.println("River supports a rich ecosystem in the NatureZone.");
    }

    @Override
    public void provideScenery() {
        System.out.println("Mountain provides beautiful scenery in the NatureZone.");
    }

    @Override
    public void supportWildlife() {
        System.out.println("Mountain supports diverse wildlife in the NatureZone.");
    }

    @Override
    public void attractClimbers() {
        System.out.println("Mountain attracts climbers in the NatureZone.");
    }
}
