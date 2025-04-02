package com.xworkz.inheritance;

public class Garment extends Shirt
{
    public void wear() {
        super.wear();
        System.out.println("Running wear shirt in garment");
    }
    public void wash() {
        super.wash();
        System.out.println("Running wash shirt in garment");
    }

    public void fold() {
        super.fold();
        System.out.println("Running fold shirt in garment");
    }
    public void iron() {
        super.iron();
        System.out.println("Running iron shirt in garment");
    }
    public void checkSize() {
        super.checkSize();
        System.out.println("Running check shirt size in garment");
    }
}
