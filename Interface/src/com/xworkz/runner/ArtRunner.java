package com.xworkz.runner;

import com.xworkz.implement.Painting;
import com.xworkz.internal.Art;

public class ArtRunner {
    public static void main(String[] args) {
        Art art=new Painting();
        art.create();
        art.describeStyle();
        art.display();
    }

}
