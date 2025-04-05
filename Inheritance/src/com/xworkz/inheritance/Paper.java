package com.xworkz.inheritance;

public class Paper extends Calendar {

    @Override
    public void displayDate() {
        super.displayDate();
        System.out.println("Running display date in paper...");
    }

    @Override
    public void changeMonth() {
        super.changeMonth();
        System.out.println("Running change month in paper...");
    }

    @Override
    public void markEvent() {
        super.markEvent();
        System.out.println("Running mark event in paper...");
    }

    @Override
    public void checkHoliday() {
        super.checkHoliday();
        System.out.println("Running check holiday in paper...");
    }

    @Override
    public void flipPage() {
        super.flipPage();
        System.out.println("Running flip page in paper...");
    }
}
