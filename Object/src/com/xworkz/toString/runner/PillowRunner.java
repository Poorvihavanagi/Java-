package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Pillow;

public class PillowRunner {
    public static void main(String[] args) {
        Pillow pillow = new Pillow("Memory Foam", "20x26", "Medium");
        System.out.println(pillow);

        int hash = pillow.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(pillow));

        Pillow pillow1 = new Pillow("Feather", "18x24", "Soft");
        Pillow pillow2 = new Pillow("Feather", "18x24", "Soft");

        System.out.println("Checking same location: " + (pillow1 == pillow2));
        boolean same = pillow1.equals(pillow2);
        System.out.println("Pillow1 is same as Pillow2: " + same);
    }
}
