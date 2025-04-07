package com.xworkz.inheritance;

public class Cookie extends Baked {

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Running prepare in Cookie");
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Running bake in Cookie");
    }

    @Override
    public void coolDown() {
        super.coolDown();
        System.out.println("Running coolDown in Cookie");
    }

    @Override
    public void pack() {
        super.pack();
        System.out.println("Running pack in Cookie");
    }

    @Override
    public void serve() {
        super.serve();
        System.out.println("Running serve in Cookie");
    }
    public void slice(){
        System.out.println("Running slice in cookie");
    }
}
