package com.xworkz.copies;

import com.xworkz.internal.Candle;
import com.xworkz.internal.Glass;
import com.xworkz.brandNew.CandleAndGlass;

public class CandleGlassRunner {
    public static void main(String[] args) {
        Candle candle = new CandleAndGlass();
        candle.lightUp();
        candle.melt();
        candle.giveFragrance();

        System.out.println("------------------------------");

        Glass glass = new CandleAndGlass();
        glass.fill();
        glass.drink();
        glass.clean();
    }
}
