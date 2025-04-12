package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Dustbin;

public class DustbinRunner {
    public static void main(String[] args) {
        Dustbin dustbin = new Dustbin("Green", 20, "Plastic");
        System.out.println(dustbin);

        int hash = dustbin.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(dustbin));

        Dustbin dustbin1 = new Dustbin("Green", 20, "Plastic");
        Dustbin dustbin2 = new Dustbin("Black", 25, "Metal");

        System.out.println("Checking same location: " + (dustbin1 == dustbin2));
        boolean same = dustbin1.equals(dustbin2);
        System.out.println("Dustbin1 is same as Dustbin2: " + same);
    }
}
