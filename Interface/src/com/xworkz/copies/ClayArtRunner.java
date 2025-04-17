package com.xworkz.copies;

import com.xworkz.internal.Claypot;
import com.xworkz.internal.Art;
import com.xworkz.brandNew.ClayArt;

public class ClayArtRunner {
    public static void main(String[] args) {
        Claypot claypot = new ClayArt();
        claypot.heatUp();
        claypot.cook();
        claypot.coolDown();

        System.out.println("------------------------------");

        Art art = new ClayArt();
        art.create();
        art.describeStyle();
        art.display();
    }
}
