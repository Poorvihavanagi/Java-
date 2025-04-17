package com.xworkz.runner;

import com.xworkz.internal.Jam;
import com.xworkz.implement.StrawberryJam;

public class JamRunner {
    public static void main(String[] args) {
        Jam jam = new StrawberryJam();
        jam.spread();
        jam.taste();
        jam.store();
        jam.checkExpiry();
    }
}
