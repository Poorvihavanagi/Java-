package com.xworkz.inheritance;

public class Wax extends Candle
{
    public void light() {
        super.light();
        System.out.println("Running candle light in wax");
    }
    public void melt() {
        super.melt();
        System.out.println("Running candle melt in wax");
    }
    public void extinguish() {
        super.extinguish();
        System.out.println("Running candle extinguish in wax");
    }
    public void emitFragrance() {
        super.emitFragrance();
        System.out.println("Running candle fragrance in wax");
    }
    public void provideLight() {
        super.provideLight();
        System.out.println("Running candle light in wax");
    }
}
