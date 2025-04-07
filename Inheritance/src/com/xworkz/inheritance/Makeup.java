package com.xworkz.inheritance;

public class Makeup extends Cosmetic {

    @Override
    public void apply() {
        super.apply();
        System.out.println("Running apply in makeup");
    }

    @Override
    public void remove() {
        super.remove();
        System.out.println("Running remove in makeup");
    }

    @Override
    public void checkIngredients() {
        super.checkIngredients();
        System.out.println("Running check Ingredients in makeup");
    }

    @Override
    public void smell() {
        super.smell();
        System.out.println("Running smell in makeup");
    }

    @Override
    public void store() {
        super.store();
        System.out.println("Running store in makeup");
    }

    public void chooseShade(){
        System.out.println("Running choose shade in makeup");
    }
}
