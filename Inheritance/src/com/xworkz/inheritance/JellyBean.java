package com.xworkz.inheritance;

public class JellyBean extends Candy{
    public void lick(){
        System.out.println("Licking the lollipop slowly");
    }
    public void sugarCoat(Candy candy){
        candy.checkFlavor();
        candy.chew();
        candy.dissolve();
        candy.taste();
        candy.unwrap();

        if(candy instanceof JellyBean){
            System.out.println("Candy is instance jelly bean ");
            JellyBean jellyBean=(JellyBean) candy;
            jellyBean.lick();
        }
    }
}
