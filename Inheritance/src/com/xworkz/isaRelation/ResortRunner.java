package com.xworkz.isaRelation;

import com.xworkz.inheritance.BeachResort;
import com.xworkz.inheritance.HillResort;
import com.xworkz.inheritance.Resort;

public class ResortRunner
{
    public static void main(String[] args) {

            BeachResort beachResort = new BeachResort();
            beachResort.bookRoom();
            beachResort.serveFood();
            beachResort.provideEntertainment();
            beachResort.offerSpaServices();
            beachResort.maintainHygiene();

            System.out.println("----------------------------------------------");
            Resort resort = new BeachResort();
            resort.bookRoom();
            resort.serveFood();
            resort.provideEntertainment();
            resort.offerSpaServices();
            resort.maintainHygiene();

            System.out.println("----------------------------------------------");
            HillResort hillResort=new HillResort();
            hillResort.arrangeTrekking(hillResort);
    }
}
