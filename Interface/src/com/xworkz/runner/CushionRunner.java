package com.xworkz.runner;

import com.xworkz.internal.Cushion;
import com.xworkz.implement.MemoryFoamCushion;

public class CushionRunner {
    public static void main(String[] args) {
        Cushion cushion = new MemoryFoamCushion();
        cushion.place();
        cushion.fluff();
        cushion.clean();

        cushion.refresh();
        cushion.store();
    }
}
