package com.xworkz.implement;

import com.xworkz.internal.Calendar;

public class WallCalendar implements Calendar {
    public void showDate() {
        System.out.println("Showing today's date on the wall calendar.");
    }

    public void showMonth() {
        System.out.println("Displaying current month on the wall calendar.");
    }

    public void flipPage() {
        System.out.println("Flipping the page of the wall calendar.");
    }
    @Override
    public void displayYear() {
        System.out.println("Overridden: Displaying the year in the wall calendar.");
    }
}
