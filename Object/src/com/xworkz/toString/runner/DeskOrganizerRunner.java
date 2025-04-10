package com.xworkz.toString.runner;
import com.xworkz.toString.internal.DeskOrganizer;

public class DeskOrganizerRunner {
    public static void main(String[] args) {
        DeskOrganizer organizer = new DeskOrganizer("Stationery", 5, "Wood");
        System.out.println(organizer);

        int hash = organizer.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(organizer));
    }
}