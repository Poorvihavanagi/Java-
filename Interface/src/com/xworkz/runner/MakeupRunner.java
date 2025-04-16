package com.xworkz.runner;

import com.xworkz.internal.Makeup;
import com.xworkz.implement.Lipstick;

public class MakeupRunner {
    public static void main(String[] args) {
        Makeup makeup = new Lipstick();
        makeup.apply();
        makeup.remove();
        makeup.store();
    }
}
