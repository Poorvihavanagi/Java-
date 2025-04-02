package com.xworkz.inheritance;

public class Sweet extends Cake
{
    public void bake() {
        super.bake();
        System.out.println("Running cake bake in sweet");
    }
    public void decorate() {
        super.decorate();
        System.out.println("Running cake decorate in sweet");
    }
    public void slice() {
        super.slice();
        System.out.println("Running cake slice in sweet");
    }
    public void serve() {
        super.serve();
        System.out.println("Running cake serve in sweet");
    }
    public void taste() {
        super.taste();
        System.out.println("Running cake taste in sweet");
    }
}
