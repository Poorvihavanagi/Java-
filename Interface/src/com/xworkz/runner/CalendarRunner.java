package com.xworkz.runner;

import com.xworkz.implement.WallCalendar;
import com.xworkz.internal.Calendar;

public class CalendarRunner {
    public static void main(String[] args) {
        Calendar calendar = new WallCalendar();
        calendar.showDate();
        calendar.showMonth();
        calendar.flipPage();

        calendar.displayYear();
    }
}
