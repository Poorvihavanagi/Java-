package com.xworkz.practice.runner;

import com.xworkz.practice.external.TravelAgency;
import com.xworkz.practice.internal.ThomasCookToursImpl;
import com.xworkz.practice.internal.TourismBoard;

public class TourismBoardRunner {
    public static void main(String[] args) {
        TourismBoard tourismBoard=new ThomasCookToursImpl();
        TravelAgency travelAgency=new TravelAgency(tourismBoard);
        travelAgency.bookPackage();
    }
}
