package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Scissors;

public class ScissorsRunner {
    public static void main(String[] args) {
        Scissors scissors = new Scissors("Camlin", "Office", 15);
        System.out.println(scissors);

        int hash = scissors.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(scissors));

        Scissors scissors1 = new Scissors("Camlin", "Office", 15);
        Scissors scissors2 = new Scissors("Camlin", "Office", 15);

        System.out.println("Checking same location: " + (scissors1 == scissors2));
        boolean same = scissors1.equals(scissors2);
        System.out.println("Scissors1 is same as Scissors2: " + same);
    }
}
