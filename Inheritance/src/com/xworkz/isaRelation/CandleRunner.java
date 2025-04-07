package com.xworkz.isaRelation;

import com.xworkz.inheritance.Candle;
import com.xworkz.inheritance.ScentedCandle;
import com.xworkz.inheritance.Wax;

public class CandleRunner
{
    public static void main(String[] args) {
        Wax wax = new Wax();
        wax.light();
        wax.melt();
        wax.extinguish();
        wax.emitFragrance();
        wax.provideLight();

        System.out.println("------------------------------------");
        Candle candle = new Wax();
        candle.light();
        candle.melt();
        candle.extinguish();
        candle.emitFragrance();
        candle.provideLight();

        System.out.println("------------------------------------");
        ScentedCandle scentedCandle=new ScentedCandle();
        scentedCandle.setAroma(scentedCandle);
    }
}
