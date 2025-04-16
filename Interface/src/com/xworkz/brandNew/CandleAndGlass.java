package com.xworkz.brandNew;

import com.xworkz.internal.Candle;
import com.xworkz.internal.Glass;

public class CandleAndGlass implements Candle, Glass {

    @Override
    public void lightUp() {
        System.out.println("Lighting up the candle.");
    }

    @Override
    public void melt() {
        System.out.println("The candle is melting.");
    }

    @Override
    public void giveFragrance() {
        System.out.println("The candle is giving fragrance.");
    }

    @Override
    public void fill() {
        System.out.println("Filling the glass.");
    }

    @Override
    public void drink() {
        System.out.println("Drinking from the glass.");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the glass.");
    }
}
