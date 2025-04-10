package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Clip;

public class ClipRunner {
    public static void main(String[] args) {
        Clip clip = new Clip("Binder", 12, "Silver");
        System.out.println(clip);

        int hash = clip.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(clip));
    }
}
