package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Toy;

public class ToyRunner {
    public static void main(String[] args) {
        Toy toy=new Toy("Remote Car", "Electronic",850);
        System.out.println(toy);

        int hash = toy.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(toy));

        Toy toy1 = new Toy("Remote Car", "Electronic", 850);
        Toy toy2 = new Toy("Shatabdi Express", "Electronic", 850);

        System.out.println("Checking same location: " + (toy1 == toy2));
        boolean same = toy1.equals(toy2);
        System.out.println("Toy1 is same as Toy2: " + same);
    }
}
