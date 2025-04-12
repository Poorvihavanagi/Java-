package com.xworkz.toString.runner;
import com.xworkz.toString.internal.DeskOrganizer;

public class DeskOrganizerRunner {
    public static void main(String[] args) {
        DeskOrganizer organizer = new DeskOrganizer("Stationery", 5, "Wood");
        System.out.println(organizer);

        int hash = organizer.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(organizer));

        DeskOrganizer organizer1 = new DeskOrganizer("Stationery", 5, "Wood");
        DeskOrganizer organizer2 = new DeskOrganizer("Stationery", 4, "Metal");

        System.out.println("Checking same location: " + (organizer1 == organizer2));
        boolean same = organizer1.equals(organizer2);
        System.out.println("Organizer1 is same as Organizer2: " + same);

    }
}