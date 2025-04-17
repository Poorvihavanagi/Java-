package com.xworkz.implement;

import com.xworkz.internal.Perfume;

public class LuxuryPerfume implements Perfume {
    public void spray() {
        System.out.println("Spraying luxury perfume.");
    }

    public void refill() {
        System.out.println("Refilling the luxury perfume bottle.");
    }

    public void giveFragrance() {
        System.out.println("Luxury perfume gives a pleasant fragrance.");
    }

    @Override
    public void checkExpiry() {
        System.out.println("Checking the expiry date of the floral perfume.");
    }

    @Override
    public void displayBrand() {
        System.out.println("This is a brand-name floral perfume.");
    }
}
