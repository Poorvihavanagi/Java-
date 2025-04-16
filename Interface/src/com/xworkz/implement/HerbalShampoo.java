package com.xworkz.implement;

import com.xworkz.internal.Shampoo;

public class HerbalShampoo implements Shampoo {
    public void apply() {
        System.out.println("Applying herbal shampoo to hair.");
    }

    public void rinse() {
        System.out.println("Rinsing the hair with water.");
    }

    public void store() {
        System.out.println("Storing the herbal shampoo bottle in the bathroom.");
    }
}
