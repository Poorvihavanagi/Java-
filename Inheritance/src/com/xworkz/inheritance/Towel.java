package com.xworkz.inheritance;

public class Towel extends Cloth{
    public void foldNapkin() {
        System.out.println("Running fold napkin in napkin");
    }
    public void dryBody(Cloth cloth){
        cloth.dry();
        cloth.clean();
        cloth.absorb();
        cloth.fold();
        cloth.reuse();

        if(cloth instanceof Towel){
            System.out.println("Cloth is an instance of towel");
            Towel towel=(Towel) cloth;
            towel.foldNapkin();
        }
    }
}
