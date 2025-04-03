package com.xworkz.isaRelation;

import com.xworkz.inheritance.Candy;
import com.xworkz.inheritance.Lolipop;

public class CandyRunner {
    public static void main(String[] args) {
        Lolipop lollipop = new Lolipop();
        lollipop.taste();
        lollipop.chew();
        lollipop.unwrap();
        lollipop.dissolve();
        lollipop.checkFlavor();

        System.out.println("-----------------------------------------------------------------------");
        Candy candy = new Lolipop();
        candy.taste();
        candy.chew();
        candy.unwrap();
        candy.dissolve();
        candy.checkFlavor();
    }
}
