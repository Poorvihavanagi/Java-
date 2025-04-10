package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Cup;

public class CupRunner {
    public static void main(String[] args) {
        Cup cup = new Cup("Ceramic", 300, "ClayCraft");
        System.out.println(cup);

        int hash = cup.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(cup));
    }
}
