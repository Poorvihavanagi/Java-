package com.xworkz.isaRelation;


import com.xworkz.inheritance.Garment;
import com.xworkz.inheritance.Shirt;

public class ShirtRunner
{
    public static void main(String[] args) {

        Garment garment = new Garment();
        garment.wear();
        garment.wash();
        garment.fold();
        garment.iron();
        garment.checkSize();

        System.out.println("-------------------------------");

        Shirt shirt = new Garment();
        shirt.wear();
        shirt.wash();
        shirt.fold();
        shirt.iron();
        shirt.checkSize();
    }
}
