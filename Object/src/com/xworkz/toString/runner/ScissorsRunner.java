package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Scissors;

public class ScissorsRunner {
    public static void main(String[] args) {
        Scissors scissors = new Scissors("Camlin", "Office", 15);
        System.out.println(scissors);

        int hash = scissors.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(scissors));
    }
}
