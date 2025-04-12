package com.xworkz.toString.runner;

import com.xworkz.toString.internal.TissueBox;

public class TissueBoxRunner {
    public static void main(String[] args) {
        TissueBox box = new TissueBox("Origami", 100, "Soft Paper");
        System.out.println(box);

        int hash = box.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(box));

        TissueBox box1 = new TissueBox("Origami", 100, "Soft Paper");
        TissueBox box2 = new TissueBox("Origami", 100, "Soft Paper");

        System.out.println("Checking same location: " + (box1 == box2));
        boolean same = box1.equals(box2);
        System.out.println("Box1 is same as Box2: " + same);
    }
}
