package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Clip;

public class ClipRunner {
    public static void main(String[] args) {
        Clip clip = new Clip("Binder", 12, "Silver");
        System.out.println(clip);

        int hash = clip.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(clip));

        Clip clip1 = new Clip("Binder", 12, "Silver");
        Clip clip2 = new Clip("Paperclip", 20, "Gold");

        System.out.println("Checking same location: " + (clip1 == clip2));
        boolean same = clip2.equals(clip1);
        System.out.println("Clip1 is same as Clip2: " + same);
    }
}
