package com.xworkz.runner;

import com.xworkz.internal.Mug;
import com.xworkz.implement.CoffeeMug;

public class MugRunner {
    public static void main(String[] args) {
        Mug mug = new CoffeeMug();
        mug.fill();
        mug.drink();
        mug.clean();
    }
}
