package com.xworkz.runner;

import com.xworkz.internal.Candle;
import com.xworkz.implement.ScentedCandle;

public class CandleRunner {
    public static void main(String[] args) {
        Candle candle = new ScentedCandle();
        candle.lightUp();
        candle.melt();
        candle.giveFragrance();

        candle.extinguish();
        candle.cleanUp();
    }
}
