package com.xworkz.brandNew;

import com.xworkz.internal.Chocolate;
import com.xworkz.internal.Jam;

public class SweetTreat implements Chocolate, Jam {

    @Override
    public void unwrap() {
        System.out.println("Unwrapping the chocolate.");
    }

    @Override
    public void eat() {
        System.out.println("Eating the chocolate.");
    }

    @Override
    public void store() {
        System.out.println("Storing the chocolate properly.");
    }

    @Override
    public void spread() {
        System.out.println("Spreading the jam on bread.");
    }

    @Override
    public void taste() {
        System.out.println("Tasting the jam.");
    }

}
