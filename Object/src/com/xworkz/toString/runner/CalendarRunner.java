package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Calendar;
public class CalendarRunner
{
        public static void main(String[] args) {
            Calendar calendar = new Calendar(2025, "Wall", "Nature");
            System.out.println(calendar);
            int hash = calendar.hashCode();

            Calendar calendar2 = new Calendar(2024, "Desk", "Quotes");
            System.out.println("Identity hash code : " + System.identityHashCode(calendar2));
            System.out.println(calendar2.hashCode());
        }


}
