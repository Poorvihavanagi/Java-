package com.xworkz.implement;

import com.xworkz.internal.Chocolate;

public class MilkChocolate implements Chocolate {
    public void unwrap() {
        System.out.println("Unwrapping the milk chocolate.");
    }

    public void eat() {
        System.out.println("Eating the milk chocolate.");
    }

    public void store() {
        System.out.println("Storing the chocolate in a cool, dry place.");
    }

    @Override
    public void melt() {
        System.out.println("Melting the milk chocolate in a bowl.");
    }

    @Override
    public void wrapUp() {
        System.out.println("Wrapping up the milk chocolate wrapper.");
    }
}
