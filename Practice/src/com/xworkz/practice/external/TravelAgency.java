package com.xworkz.practice.external;

import com.xworkz.practice.internal.TourismBoard;
import com.xworkz.practice.internal.TransportDept;

public class TravelAgency {
    private TourismBoard tourismBoard;

    public TravelAgency (TourismBoard tourismBoard){
        this.tourismBoard=tourismBoard;
        System.out.println("Paramterized const travel agency");
    }
    public void bookPackage(){
        if(this.tourismBoard!=null){
            this.tourismBoard.planTour();
            System.out.println("Not null tourism board");
        }
        else{
            System.out.println("It is null");
        }
    }
}
