package com.xworkz.toString.runner;

import com.xworkz.toString.internal.TissueBox;

public class TissueBoxRunner {
    public static void main(String[] args) {
        TissueBox box = new TissueBox("Origami", 100, "Soft Paper");
        System.out.println(box);

        int hash = box.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(box));
    }
}
