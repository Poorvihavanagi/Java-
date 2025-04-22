package com.xworkz.practice.external;

import com.xworkz.practice.internal.NewsAgency;

public class MediaHouse {
    private NewsAgency newsAgency;

    public MediaHouse(NewsAgency newsAgency){
        this.newsAgency=newsAgency;
        System.out.println("Parameterized const");
    }

    public void verifyNews(){
        if(this.newsAgency!=null){
            System.out.println("Not null");
            this.newsAgency.broadCast();
        }
        else{
            System.out.println("It is null");
        }
    }
}
