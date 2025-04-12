package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Broom;

public class BroomRunner {
    public static void main(String[] args) {
        Broom broom = new Broom("Plastic", "120cm", "Indoor");
        System.out.println(broom);

        int hash = broom.hashCode();
        System.out.println(new Broom("Monkey", "150cm", "Outdoor").hashCode());

        Broom broom1 = new Broom("Monkey", "120cm", "Indoor");
        Broom broom2 = new Broom("Monkey", "150cm", "Outdoor");

        System.out.println("Checking same location: " + (broom1 == broom2));
        boolean same = broom2.equals(broom1);
        System.out.println("Broom1 is same as Broom2: " + same);

    }
}