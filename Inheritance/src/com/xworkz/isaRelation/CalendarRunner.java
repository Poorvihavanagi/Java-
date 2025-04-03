package com.xworkz.isaRelation;

import com.xworkz.inheritance.Calendar;
import com.xworkz.inheritance.Paper;

public class CalendarRunner {
    public static void main(String[] args) {
        Paper paper = new Paper();
        paper.displayDate();
        paper.changeMonth();
        paper.markEvent();
        paper.checkHoliday();
        paper.flipPage();

        System.out.println("---------------------------------------");
        Calendar calendar = new Paper();
        calendar.displayDate();
        calendar.changeMonth();
        calendar.markEvent();
        calendar.checkHoliday();
        calendar.flipPage();
    }
}
