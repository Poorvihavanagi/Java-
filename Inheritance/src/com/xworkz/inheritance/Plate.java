package com.xworkz.inheritance;

public class Plate extends Dish {

    @Override
    public void wash() {
        super.wash();
        System.out.println("Running wash in Plate");
    }

    @Override
    public void store() {
        super.store();
        System.out.println("Running store in Plate");
    }

    @Override
    public void use() {
        super.use();
        System.out.println("Running use in Plate");
    }

    @Override
    public void dry() {
        super.dry();
        System.out.println("Running dry in Plate");
    }

    @Override
    public void checkMaterial() {
        super.checkMaterial();
        System.out.println("Running check Material in Plate");
    }
}
