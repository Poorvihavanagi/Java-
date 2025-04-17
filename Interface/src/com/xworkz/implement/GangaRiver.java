package com.xworkz.implement;

import com.xworkz.internal.River;

public class GangaRiver implements River {
    public void flow() {
        System.out.println("Ganga river is flowing towards the ocean.");
    }

    public void provideWater() {
        System.out.println("Ganga river provides water to millions of people.");
    }

    public void supportEcosystem() {
        System.out.println("Ganga river supports a diverse ecosystem of plants and animals.");
    }
    @Override
    public void flood() {
        System.out.println("The Ganga River is flooding in certain areas.");
    }

    @Override
    public void dryUp() {
        System.out.println("The Ganga River is facing reduced water levels during drought.");
    }
}
