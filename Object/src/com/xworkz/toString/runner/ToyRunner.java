package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Toy;

public class ToyRunner {
    public static void main(String[] args) {
        Toy toy=new Toy("Remote Car", "Electronic",850);
        System.out.println(toy);

        int hash = toy.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(toy));
    }
}
