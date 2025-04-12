package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Train;

public class TrainRunner {
    public static void main(String[] args) {
        Train train = new Train("Vande Bharat Express", 180, 16);
        System.out.println(train);

        int hash = train.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(train));

        Train train1 = new Train("Vande Bharat Express", 180, 16);
        Train train2 = new Train("Shatabdi Express", 150, 18);

        System.out.println("Checking same location: " + (train1 == train2));
        boolean same = train1.equals(train2);
        System.out.println("Train1 is same as Train2: " + same);
    }
}
