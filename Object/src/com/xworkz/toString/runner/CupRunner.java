package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Cup;

public class CupRunner {
    public static void main(String[] args) {
        Cup cup = new Cup("Ceramic", 300, "ClayCraft");
        System.out.println(cup);

        int hash = cup.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(cup));

        Cup cup1 = new Cup("Ceramic", 300, "ClayCraft");
        Cup cup2 = new Cup("Ceramic", 350, "ClayCraft");

        System.out.println("Checking same location: " + (cup1 == cup2));
        boolean same = cup1.equals(cup2);
        System.out.println("Cup1 is same as Cup2: " + same);

    }
}
