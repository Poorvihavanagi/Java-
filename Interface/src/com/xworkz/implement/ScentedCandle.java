package com.xworkz.implement;

import com.xworkz.internal.Candle;

public class ScentedCandle implements Candle {
    public void lightUp() {
        System.out.println("Lighting up the scented candle.");
    }

    public void melt() {
        System.out.println("Scented candle is melting slowly.");
    }

    public void giveFragrance() {
        System.out.println("Scented candle is spreading fragrance.");
    }
}
