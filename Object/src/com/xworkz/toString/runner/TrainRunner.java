package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Train;

public class TrainRunner {
    public static void main(String[] args) {
        Train train = new Train("Vande Bharat Express", 180, 16);
        System.out.println(train);

        int hash = train.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(train));
    }
}
