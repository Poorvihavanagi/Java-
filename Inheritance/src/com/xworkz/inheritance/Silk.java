package com.xworkz.inheritance;

public class Silk extends Fabric {

    @Override
    public void weave() {
        super.weave();
        System.out.println("Running weave in silk");
    }

    @Override
    public void dye() {
        super.dye();
        System.out.println("Running dye in silk");
    }

    @Override
    public void wash() {
        super.wash();
        System.out.println("Running wash in silk");
    }

    @Override
    public void dry() {
        super.dry();
        System.out.println("Running dry in silk");
    }

    @Override
    public void checkQuality() {
        super.checkQuality();
        System.out.println("Running check quality in silk");
    }
}
