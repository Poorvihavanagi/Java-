package com.xworkz.runner;

import com.xworkz.internal.Perfume;
import com.xworkz.implement.LuxuryPerfume;

public class PerfumeRunner {
    public static void main(String[] args) {
        Perfume perfume = new LuxuryPerfume();
        perfume.spray();
        perfume.refill();
        perfume.giveFragrance();
        perfume.checkExpiry();
        perfume.displayBrand();
    }
}
