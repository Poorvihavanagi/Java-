package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Pillow;

public class PillowRunner {
    public static void main(String[] args) {
        Pillow pillow = new Pillow("Memory Foam", "20x26", "Medium");
        System.out.println(pillow);

        int hash = pillow.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(pillow));
    }
}
