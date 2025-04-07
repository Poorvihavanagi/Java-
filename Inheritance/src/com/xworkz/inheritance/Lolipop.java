package com.xworkz.inheritance;

public class Lolipop extends Candy {

    @Override
    public void taste() {
        super.taste();
        System.out.println("Running taste in lollipop");
    }

    @Override
    public void chew() {
        super.chew();
        System.out.println("Running chew in lollipop");
    }

    @Override
    public void unwrap() {
        super.unwrap();
        System.out.println("Running unwrap in lollipop");
    }

    @Override
    public void dissolve() {
        super.dissolve();
        System.out.println("Running dissolve in lollipop");
    }

    @Override
    public void checkFlavor() {
        super.checkFlavor();
        System.out.println("Running check Flavor in lollipop");
    }

    public void lick(){
        System.out.println("Running lick in lollipop");
    }
}
