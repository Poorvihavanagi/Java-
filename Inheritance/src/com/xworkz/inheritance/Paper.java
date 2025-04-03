package com.xworkz.inheritance;

public class Paper extends Calendar {

    public void displayDate() {
        super.displayDate();
        System.out.println("Showing today's date on a paper calendar...");
    }
    public void changeMonth() {
        super.changeMonth();
        System.out.println("Manually flipping the paper calendar to the next month...");
    }
    public void markEvent() {
        super.markEvent();
        System.out.println("Using a pen to mark an event on the paper calendar...");
    }
    public void checkHoliday() {
        super.checkHoliday();
        System.out.println("Looking at the calendar to see if it's a holiday...");
    }
    public void flipPage() {
        super.flipPage();
        System.out.println("Turning the paper page to the next month...");
    }
}
