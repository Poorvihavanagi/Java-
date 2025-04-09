package com.xworkz.toString.runner;
import com.xworkz.toString.internal.DeskOrganizer;

public class DeskOrganizerRunner {
    public static void main(String[] args) {
        DeskOrganizer organizer = new DeskOrganizer("Stationery", 5, "Wood");
        System.out.println(organizer);
    }
}