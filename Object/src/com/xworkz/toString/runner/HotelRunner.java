package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Hotel;

public class HotelRunner
{
    public static void main(String[] args) {

        Hotel hotel=new Hotel("Taj", 5, 8999.99);
        System.out.println(hotel);
    }
}
