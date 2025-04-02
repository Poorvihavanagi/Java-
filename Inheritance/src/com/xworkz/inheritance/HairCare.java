package com.xworkz.inheritance;

public class HairCare extends Shampoo
{
    public void cleanse() {
        super.cleanse();
        System.out.println("Running shampoo cleanse in hair care");
    }
    public void lather() {
        super.lather();
        System.out.println("Running shampoo leather in hair care");
    }
    public void rinse() {
        super.rinse();
        System.out.println("Running shampoo rinse in hair care");
    }
    public void nourish() {
        super.nourish();
        System.out.println("Running shampoo nourish in hair care");
    }
    public void fragrance() {
        super.fragrance();
        System.out.println("Running shampoo fragrance in hair care");
    }
}
