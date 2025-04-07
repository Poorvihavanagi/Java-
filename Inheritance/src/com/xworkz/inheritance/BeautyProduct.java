package com.xworkz.inheritance;

public class BeautyProduct extends NailPolish {

    @Override
    public void apply() {
        super.apply();
        System.out.println("Running apply in BeautyProduct");
    }

    @Override
    public void remove() {
        super.remove();
        System.out.println("Running remove in BeautyProduct");
    }

    @Override
    public void dry() {
        super.dry();
        System.out.println("Running dry in BeautyProduct");
    }

    @Override
    public void checkColor() {
        super.checkColor();
        System.out.println("Running checkColor in BeautyProduct");
    }

    @Override
    public void shake() {
        super.shake();
        System.out.println("Running shake in BeautyProduct");
    }

    public void shine(){
        System.out.println("Running shine nail polish in beauty product");
    }
}
