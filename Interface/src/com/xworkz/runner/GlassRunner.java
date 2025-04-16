package com.xworkz.runner;

import com.xworkz.internal.Glass;
import com.xworkz.implement.DrinkingGlass;

public class GlassRunner {
    public static void main(String[] args) {
        Glass glass = new DrinkingGlass();
        glass.fill();
        glass.drink();
        glass.clean();
    }
}
