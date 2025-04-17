package com.xworkz.runner;

import com.xworkz.internal.Bed;
import com.xworkz.implement.KingSizeBed;

public class BedRunner {
    public static void main(String[] args) {
        Bed bed = new KingSizeBed();
        bed.makeBed();
        bed.sleep();
        bed.cleanBed();

        bed.adjustHeadrest();
        bed.setBedsideLamp();
    }
}
