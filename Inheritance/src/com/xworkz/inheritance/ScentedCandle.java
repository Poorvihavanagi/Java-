package com.xworkz.inheritance;

public class ScentedCandle extends Candle{
   public void mold(){
       System.out.println("Wax is being molded into different shapes");
    }
    public void setAroma(Candle candle){
       candle.emitFragrance();
       candle.light();
       candle.extinguish();
       candle.melt();
       candle.provideLight();

       if(candle instanceof ScentedCandle){
           System.out.println("Candle is instance of scented candle");
           ScentedCandle scentedCandle=(ScentedCandle) candle;
           scentedCandle.mold();
       }
    }
}
