package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Hotel;

public class HotelRunner
{
    public static void main(String[] args) {

        Hotel hotel=new Hotel("Taj", 5, 8999.99);
        System.out.println(hotel);

        int hash = hotel.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(hotel));

        Hotel hotel1 = new Hotel("Taj", 5, 8999.99);
        Hotel hotel2 = new Hotel("Oberoi", 5, 9999.99);

        System.out.println("Checking same location: " + (hotel1 == hotel2));
        boolean same = hotel1.equals(hotel2);
        System.out.println("Hotel1 is same as Hotel2: " + same);
    }
}
