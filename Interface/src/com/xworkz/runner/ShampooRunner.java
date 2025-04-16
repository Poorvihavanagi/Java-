package com.xworkz.runner;

import com.xworkz.internal.Shampoo;
import com.xworkz.implement.HerbalShampoo;

public class ShampooRunner {
    public static void main(String[] args) {
        Shampoo shampoo = new HerbalShampoo();
        shampoo.apply();
        shampoo.rinse();
        shampoo.store();
    }
}
