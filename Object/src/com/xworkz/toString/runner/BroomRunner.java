package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Broom;

public class BroomRunner {
    public static void main(String[] args) {
        Broom broom = new Broom("Plastic", "120cm", "Indoor");
        System.out.println(broom);

        int hash = broom.hashCode();
        System.out.println(new Broom("Monkey", "150cm", "Outdoor").hashCode());
    }
}