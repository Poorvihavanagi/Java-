package com.xworkz.inheritance;

public class Ring extends Jewelry
{
    public void wear() {
        super.wear();
        System.out.println("Wearing the ring on the finger...");
    }

    public void shine() {
        super.shine();
        System.out.println("Polishing the ring for extra shine...");
    }

    public void design() {
        super.design();
        System.out.println("Designing the ring with intricate patterns...");
    }

    public void value() {
        super.value();
        System.out.println("Assessing the value of the ring based on material and design...");
    }

    public void store() {
        super.store();
        System.out.println("Keeping the ring in a safe box to prevent damage...");
    }
}
